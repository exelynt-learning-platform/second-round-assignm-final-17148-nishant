
package com.nishant.ecommerce.service;

import org.springframework.stereotype.Service;
import com.nishant.ecommerce.repository.UserRepository;
import com.nishant.ecommerce.entity.User;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User save(User user) {
        return repo.save(user);
    }

    public List<User> getAll() {
        return repo.findAll();
    }
}
