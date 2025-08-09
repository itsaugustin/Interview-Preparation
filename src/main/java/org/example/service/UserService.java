package org.example.service;

import org.example.customexception.InvalidUserIdException;
import org.example.customexception.UserNotFoundException;
import org.example.domain.User;
import org.example.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public User getUserById(Long id) {
        if (id == null || id <= 0) throw new InvalidUserIdException("ID > 0 required");
        return repo.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User " + id + " not found"));
    }
}

