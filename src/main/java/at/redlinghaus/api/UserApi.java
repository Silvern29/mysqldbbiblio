package at.redlinghaus.api;

import at.redlinghaus.controller.UserController;
import at.redlinghaus.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserApi {
    @Autowired
    private UserController userController;

    @PostMapping("/users")
    public void createUser(@RequestBody User user) {
        userController.createUser(user);
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user) {
        return userController.updateUser(user);
    }

    @PatchMapping("/users")
    public User updateField(@RequestBody User user) {
        return userController.updateUser(user);
    }

    @GetMapping("/users")
    public Iterable<User> getAll() {
        return userController.findAll();
    }
}
