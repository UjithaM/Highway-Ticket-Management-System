package com.ujitha.user_service.service.impl;

import com.ujitha.user_service.dao.UserRepo;
import com.ujitha.user_service.dto.UserDTO;
import com.ujitha.user_service.service.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceIMPL implements UserService {

    private final UserRepo userRepo;

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public void deleteUser(String userId) {

    }

    @Override
    public UserDTO getSelectedUser(String userId) {
        return null;
    }

    @Override
    public List<UserDTO> getAllUser() {
        return List.of();
    }

    @Override
    public void updateUser(String userId, UserDTO userDTO) {

    }
}
