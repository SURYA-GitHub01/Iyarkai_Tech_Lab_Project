package com.IyarkaiGreenCommune.Project.Repo;


import com.IyarkaiGreenCommune.Project.Entity.FarmEntity;
import com.IyarkaiGreenCommune.Project.Entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreenCommuneRepo extends JpaRepository<FarmEntity,Integer> {

}


