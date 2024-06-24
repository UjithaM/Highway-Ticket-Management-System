package com.ujitha.user_service.service;

import com.ujitha.user_service.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO saveUser(UserDTO userDTO);
    void deleteUser(String userId);
    UserDTO getSelectedUser(String userId);
    List<UserDTO> getAllUser();
    void updateUser(String userId,UserDTO userDTO);
}
