package org.group.apirest.controller;

import org.group.apirest.model.User;
import org.group.apirest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/paymentCards")
public class PaymentCardController {

    /*
    @Autowired
    private UserService userService;
    */
    @GetMapping("test")
    public String testEndpoint() {
        return "Endpoint working.";
    }

    @GetMapping("")
    public String getUsers(){
    /*
        return userService.getAllUsers();
    */
        return "";
    }


    @PostMapping("/create")
    public void insertUser(@RequestBody User user){
      /*
        userService.insertUser(user);
    */
    }


    @PutMapping("/update")
    public void updateUser(@RequestBody User user){
       /*
        userService.updateUser(user);
    */
    }


    @DeleteMapping("/delete")
    public void deleteUser(@RequestBody int id){
        /*
        userService.deleteUser(id);
    */
    }
}
