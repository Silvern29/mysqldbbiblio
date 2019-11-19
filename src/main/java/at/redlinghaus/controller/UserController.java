package at.redlinghaus.controller;

import at.redlinghaus.entity.User;
import at.redlinghaus.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserRepository repository;

    public void createUser(User user) {
        repository.save(user);
    }

    public User updateUser(User user) {
        return repository.save(user);
    }

    public Iterable<User> findAll() {
        return repository.findAll();
    }


}
