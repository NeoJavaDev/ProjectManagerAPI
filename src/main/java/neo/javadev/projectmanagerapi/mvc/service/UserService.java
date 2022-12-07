package neo.javadev.projectmanagerapi.mvc.service;

import neo.javadev.projectmanagerapi.mvc.entity.User;
import neo.javadev.projectmanagerapi.mvc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public void createUser(User user){
        userRepository.save(user);
    }

    public Optional<User> getUserById(Long id) {return userRepository.findById(id);}

    public void updateUser(User user) {
        userRepository.save(user);
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
