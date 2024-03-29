package neo.javadev.projectmanagerapi.rest.controller;

import neo.javadev.projectmanagerapi.rest.entity.User;
import neo.javadev.projectmanagerapi.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("users")
    public List<User> getAllUsers(){
        List<User> users = userService.getAllUsers();
        return users;
    }

    @GetMapping("user/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") Long id) {
        ResponseEntity responseEntity = new ResponseEntity(HttpStatus.NOT_FOUND);
        Optional<User> optionalUser = userService.getUserById(id);
        if(optionalUser.isPresent()){
            User user = optionalUser.get();
            return ResponseEntity.status(HttpStatus.OK).body(user);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @RequestMapping(value ="user/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createUser(@RequestBody User user) {userService.createUser(user);}

    @RequestMapping(value ="user/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateUser(@RequestBody User user) {userService.updateUser(user);}

    @RequestMapping(value ="user/delete/{id}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteUser(@PathVariable("id") Long id){
        userService.deleteUserById(id);
    }

}
