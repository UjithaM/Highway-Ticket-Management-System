package com.ujitha.user_service.util;

import com.ujitha.user_service.dto.UserDTO;
import com.ujitha.user_service.entity.UserEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class Mapping {
    private final ModelMapper mapper;
    Mapping(ModelMapper mapper) {
        this.mapper = mapper;
    }

    public UserDTO toUserDto (UserEntity userEntity) {
        return mapper.map(userEntity, UserDTO.class);
    }

    public UserEntity toUserEntity (UserDTO userDTO) {
        return mapper.map(userDTO, UserEntity.class);
    }

    public List<UserDTO> toUserDTOList(List<UserEntity> userEntities) {
        return userEntities.stream()
                .map(userEntity -> mapper.map(userEntity, UserDTO.class))
                .collect(Collectors.toList());
    }
}
