package ir.blacksparrow.graphdatabase.sevice;

import ir.blacksparrow.graphdatabase.model.User;
import ir.blacksparrow.graphdatabase.repository.IUserRepository;
import ir.blacksparrow.graphdatabase.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {
    @Autowired
    IUserRepository userRepository;

    public Collection<User> getAll(){
        return userRepository.getAllUsers();
    }
}
