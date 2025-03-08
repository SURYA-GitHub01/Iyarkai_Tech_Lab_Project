package com.IyarkaiGreenCommune.Project.Controller;

import com.IyarkaiGreenCommune.Project.Entity.FarmEntity;
import com.IyarkaiGreenCommune.Project.Service.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Farm")
public class FarmController {

    @Autowired
    private FarmService farmService;

    @PostMapping("/add")
    private void addMethod(@RequestBody FarmEntity userId){
        farmService.addMethod(userId);
    }

    @GetMapping("/getAll")
    private List<FarmEntity> getAllMethod(){
        return farmService.getAllMethods();
    }

    @GetMapping("/getBy")
    private Optional<FarmEntity> getMethod(@RequestBody int farmId){
        return farmService.getMethods(farmId);
    }

    @PutMapping("/update")
    private void updateMethod(@RequestBody FarmEntity userId){
        farmService.updateMethods(userId);
    }

    @DeleteMapping("/delete")
    private String deleteMethod(@PathVariable int farmId){
        return farmService.deleteMethods(farmId);
    }
}

