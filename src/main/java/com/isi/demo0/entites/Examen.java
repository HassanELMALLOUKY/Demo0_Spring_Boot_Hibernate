package com.isi.demo0.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Examen implements Serializable {
    @Id @GeneratedValue
    private int idExamen;
    private Date dateExamen;
    private String heure;
    @ManyToOne
    private Salle salle;
    @OneToMany(mappedBy = "examen")
    private Collection<Surveillant> surveillants;
    @OneToMany(mappedBy = "examen")
    private Collection<Examen_has_professeur_has_module_has_etudiant> examen_has_professeur_has_module_has_etudiants;
}
