package io.github.kamaudan.Reddy.Controllers;


import io.github.kamaudan.Reddy.UserRepository.UserRepository;
import io.github.kamaudan.Reddy.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/v1/user")
public class UserApi
{

    @Autowired
    private UserRepository userRepository;

    public UserApi(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



    @PostMapping("/users/{id}")
    public User  addUser(@RequestBody final String id,
                         @RequestBody final  String name) {

        userRepository.save(new User(id, name, 111100L));


        return userRepository.findById(id);
    }





    @PostMapping("/update/{id}/{name}")
    public User update(@PathVariable("id") final String id,
                       @PathVariable("name") final String name){


        userRepository.update(new User(id, name, 1000L));

        return  userRepository.findById(id);
    }



    @GetMapping("/all")
    public Map<String, User> findAll(){

        return userRepository.findAll();
    }




    @GetMapping("/delete/{id}")
    public  User delete(@PathVariable("id") final  String id) {

        userRepository.delete(id);

        return  userRepository.findById(id);
        }






}
