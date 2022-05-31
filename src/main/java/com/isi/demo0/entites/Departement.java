package com.isi.demo0.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor

public class Departement implements Serializable {
    @Id
    @GeneratedValue
    private int idDepartement;
    private String name;

    public Departement(String name) {
        this.name = name;
    }
}
