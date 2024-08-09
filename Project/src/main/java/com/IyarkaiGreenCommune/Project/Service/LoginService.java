package com.IyarkaiGreenCommune.Project.Service;

import com.IyarkaiGreenCommune.Project.Entity.LoginEntity;
import com.IyarkaiGreenCommune.Project.Repo.GreenCommuneRepo;
import com.IyarkaiGreenCommune.Project.Repo.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {
    @Autowired
    private LoginRepo loginRepo;

    public void addUser(LoginEntity loginDetails) {
        loginRepo.save(loginDetails);
    }


    public LoginEntity getUser(int userId) {
        return loginRepo.getById(userId);
    }

    public String resetUser(LoginEntity loginEntity, int userId) {
        LoginEntity newUser = loginRepo.findById(userId).orElse(null);
        if (newUser != null) {
            newUser.setUserName(loginEntity.getUserName());
            newUser.setPassword(loginEntity.getPassword());
            loginRepo.save(newUser);
            return "Reset Successfully";
        }
        return "Give Proper userId";
    }
}


