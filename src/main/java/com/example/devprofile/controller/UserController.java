package com.example.devprofile.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.devprofile.dto.UserRequestDTO;
import com.example.devprofile.dto.UserResponseDTO;
import com.example.devprofile.service.UserService;


@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserResponseDTO createUser(@RequestBody UserRequestDTO dto) {
        return userService.createUser(dto);
    }

    @GetMapping
    public List<UserResponseDTO> getAllUsers() {
        return userService.getAllUsers();   
    }
}
