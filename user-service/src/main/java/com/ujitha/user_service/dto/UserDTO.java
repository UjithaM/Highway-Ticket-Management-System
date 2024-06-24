package com.ujitha.user_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
