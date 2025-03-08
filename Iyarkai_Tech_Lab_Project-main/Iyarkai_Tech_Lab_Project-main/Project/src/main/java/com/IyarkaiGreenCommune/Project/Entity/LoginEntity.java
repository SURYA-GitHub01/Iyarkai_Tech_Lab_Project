package com.IyarkaiGreenCommune.Project.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class LoginEntity {

    @Id
    private int UserId;
    private String userName;
    private String password;
}
