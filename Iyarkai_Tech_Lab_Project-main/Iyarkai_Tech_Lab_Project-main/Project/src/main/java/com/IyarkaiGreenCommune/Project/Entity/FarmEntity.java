package com.IyarkaiGreenCommune.Project.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FarmEntity {

    @Id
    private int userId;
    private int farmId;

}
