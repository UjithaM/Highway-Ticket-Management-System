package com.ujitha.user_service.service.impl;

import com.ujitha.user_service.dao.UserRepo;
import com.ujitha.user_service.dto.UserDTO;
import com.ujitha.user_service.entity.UserEntity;
import com.ujitha.user_service.service.UserService;
import com.ujitha.user_service.util.Mapping;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceIMPL implements UserService {

    private final UserRepo userRepo;
    private final Mapping mapping;

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        long userCount = userRepo.count();
        String userId = String.format("U%04d", userCount + 1);
        userDTO.setId(userId);
        return mapping.toUserDto(userRepo.save(mapping.toUserEntity(userDTO)));
    }

    @Override
    public void deleteUser(String userId) {
        userRepo.deleteById(userId);
    }

    @Override
    public UserDTO getSelectedUser(String userId) {
        return mapping.toUserDto(userRepo.findById(userId).orElse(null));
    }

    @Override
    public List<UserDTO> getAllUser() {
        return mapping.toUserDTOList(userRepo.findAll());
    }

    @Override
    public void updateUser(String userId, UserDTO userDTO) {
        UserEntity userEntity = userRepo.findById(userId).orElse(null);

        if (userEntity != null) {
            userEntity.setFirstName(userDTO.getFirstName());
            userEntity.setLastName(userDTO.getLastName());
            userEntity.setEmail(userDTO.getEmail());
            userEntity.setPassword(userDTO.getPassword());
            userRepo.save(userEntity);
        }

    }
}
