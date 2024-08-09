package com.IyarkaiGreenCommune.Project.Service;

import com.IyarkaiGreenCommune.Project.Repo.GreenCommuneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FarmService {
    @Autowired
    private GreenCommuneRepo greenCommuneRepository;

}
