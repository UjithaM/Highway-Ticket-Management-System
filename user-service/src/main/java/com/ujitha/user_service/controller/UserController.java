package com.ujitha.user_service.controller;

import com.ujitha.user_service.dto.UserDTO;
import com.ujitha.user_service.service.UserService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    private final UserService userService;

    @GetMapping("/health")
    public String healthTest() {
        return "User Health Test";
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> saveUser(@Validated @RequestBody UserDTO userDTO, BindingResult bindingResult) {
        logger.info("Saving user details");
        if (bindingResult.hasErrors()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(bindingResult.getFieldErrors().get(0).getDefaultMessage());
        }
        try {
            UserDTO savedUser = userService.saveUser(userDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
        } catch (Exception exception) {
            logger.error("Error saving User: ", exception);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Internal server error | User saved Unsuccessfully.\nMore Details\n" + exception);
        }
    }
}
