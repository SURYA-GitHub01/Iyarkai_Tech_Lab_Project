package com.IyarkaiGreenCommune.Project.Controller;

import com.IyarkaiGreenCommune.Project.Entity.LoginEntity;
import com.IyarkaiGreenCommune.Project.Service.FarmService;
import com.IyarkaiGreenCommune.Project.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody LoginEntity loginDetails){
        loginService.addUser(loginDetails);
        return "Added Successfully";
    }

    @GetMapping("/getUser")
    public LoginEntity getUser(@PathVariable int userId){
        return loginService.getUser(userId);
    }

    @PutMapping("/resetUser")
    public String resetUser(@RequestBody LoginEntity loginEntity,@PathVariable int userId){
        return loginService.resetUser(loginEntity,userId);
    }

//    @PutMapping("/verifyUser")
//    public String verifyUser(@RequestBody LoginEntity loginEntity,@PathVariable int userId){
//        return loginService.verifyUser(loginEntity,userId);
//    }






}
