package com.recapMongo.springrecapDemoMongo.restApi;

import com.recapMongo.springrecapDemoMongo.DataAccess.UserDAL;
import com.recapMongo.springrecapDemoMongo.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("test")
public class UserController {

    @Autowired
    private UserDAL userDAL;


    @PostMapping
    public String saveUser(@RequestBody User user){
        userDAL.save(user);
        return "Add User" + user.getId();
    }


    @GetMapping("getAll")
    public List<User> getAll(){
        return  userDAL.findAll();
    }

    @GetMapping("id/{id}")
    public Optional<User> getId(@PathVariable  int id){
        return   userDAL.findById(String.valueOf(id));
    }


}

