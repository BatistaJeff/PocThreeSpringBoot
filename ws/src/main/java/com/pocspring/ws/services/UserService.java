package com.pocspring.ws.services;

import com.pocspring.ws.domain.User;
import com.pocspring.ws.exception.ObjectNotFoundException;
import com.pocspring.ws.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    public User findId(String id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não localizado"));
    }

}
