package com.IyarkaiGreenCommune.Project.Controller;

import com.IyarkaiGreenCommune.Project.Service.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authorization.method.AuthorizeReturnObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Farm")
public class FarmController {

    @Autowired
    private FarmService farmService;

    @PostMapping("/add")
    private void addMethod( ){

    }

    @GetMapping("/getAll")
    private void getAllMethod(){

    }

    @GetMapping("/getBy")
    private void getMethod(){

    }

    @PutMapping("/update")
    private void updateMethod(){

    }

    @DeleteMapping("/delete")
    private void deleteMethod(){

    }
}

