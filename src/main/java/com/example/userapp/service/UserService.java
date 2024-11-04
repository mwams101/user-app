package com.example.userapp.service;
import com.example.userapp.model.dto.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO getUserById(long id);
    List<UserDTO> getAllUsers();
    UserDTO createUser(UserDTO userDTO);
    UserDTO deleteUser(long id);

}
