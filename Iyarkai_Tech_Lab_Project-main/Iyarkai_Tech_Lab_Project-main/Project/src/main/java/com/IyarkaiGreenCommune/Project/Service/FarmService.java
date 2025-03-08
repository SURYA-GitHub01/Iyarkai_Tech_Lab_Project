package com.IyarkaiGreenCommune.Project.Service;

import com.IyarkaiGreenCommune.Project.Entity.FarmEntity;
import com.IyarkaiGreenCommune.Project.Repo.GreenCommuneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.OpenOption;
import java.util.List;
import java.util.Optional;

@Service
public class FarmService {
    @Autowired
    private GreenCommuneRepo greenCommuneRepository;


    public void addMethod(FarmEntity userId) {
          greenCommuneRepository.save(userId);
    }
    public List<FarmEntity> getAllMethods() {
        return greenCommuneRepository.findAll();
    }

    public Optional<FarmEntity> getMethods(int farmId) {
        return greenCommuneRepository.findById(farmId);
    }

    public void updateMethods(FarmEntity userId) {
         greenCommuneRepository.save(userId);
    }

    public String deleteMethods(int farmId) {
        greenCommuneRepository.deleteById(farmId);
        return "Deleted Successfully";
    }
}
