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
public class Professeur_has_module_has_etudiant implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfesseur_has_module_has_etudiant;
    @ManyToOne
    private CoursTDTP coursTDTP;
    @ManyToOne
    private Etudiant etudiant;
    @ManyToOne
    private ProfesseurHasModule professeurHasModule;
    @OneToMany(mappedBy = "professeur_has_module_has_etudiant")
    private Collection<Examen_has_professeur_has_module_has_etudiant> examen_has_professeur_has_module_has_etudiants;

}
