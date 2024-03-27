package com.github.leovd100.alura.challenge.components;

import com.github.leovd100.alura.challenge.dto.UserDTO;
import com.github.leovd100.alura.challenge.entities.User;
import org.modelmapper.ModelMapper;

public class MapperComponent {

    public static User mapperUserDTOtoUser(UserDTO dto){
        User user = new User();
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.map(dto, user);
        return user;
    }
}
