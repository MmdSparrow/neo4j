package ir.blacksparrow.graphdatabase.resource;

import ir.blacksparrow.graphdatabase.model.User;
import ir.blacksparrow.graphdatabase.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/user")
public class UserResource {
    @Autowired
    UserService userService;

    @GetMapping
    public Collection<User> getAll(){
        return userService.getAll();
    }
}
