package at.redlinghaus.controller;

import at.redlinghaus.entity.User;
import at.redlinghaus.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorizationController {
    @Autowired
    private UserRepository repository;

    public User login(User user) {
        User currentUser = repository.findById(user.getId()).get();
        if(currentUser.getPassword().equals(user.getPassword())) {
            System.out.println("LOGGED IN");
            return currentUser;
        } else {
            System.out.println("not permitted");
        }
        return null;
    }
}
