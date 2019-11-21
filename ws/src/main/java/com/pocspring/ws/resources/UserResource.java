package com.pocspring.ws.resources;


import com.pocspring.ws.domain.User;
import com.pocspring.ws.dto.UserDTO;
import com.pocspring.ws.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<UserDTO>> findAll() {

        List<User> users = userService.findAll();

        List<UserDTO> userDTOS = users.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());

        return ResponseEntity.ok().body(userDTOS);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<UserDTO> findId(@PathVariable String id) {

        User user = userService.findId(id);

        return ResponseEntity.ok().body(new UserDTO(user));
    }




}
