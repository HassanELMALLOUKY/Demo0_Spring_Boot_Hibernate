package com.isi.demo0.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Professeur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfesseur;
    private String nom;
    private String prenom;
    private String grade;
    private String cin;
    private int telephone;
    @OneToMany(mappedBy = "professeur")
    private Collection<ProfesseurHasModule> professeurHasModules;
    @OneToMany()
    private Collection<Surveillant> surveillants;
}
