package com.isi.demo0.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue
    private int idEtudiant;
    private String nom;
    private String prenom;
    private String cne;
    private Date dateNaissance;
    @OneToOne
    //@JoinColumn(name="idFiliere")
    private Filiere filiere;

}
