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
public class ProfesseurHasModule implements Serializable {
    @Id @GeneratedValue
    private int idProfesseurHasModule;
    @ManyToOne
    private Annee annee;
    @ManyToOne
    private Professeur professeur;
    @ManyToOne
    private Module module;
    @ManyToOne
    private CoursTDTP coursTDTP;
    @OneToMany(mappedBy = "professeurHasModule")
    private Collection<Professeur_has_module_has_etudiant> professeur_has_module_has_etudiants;
}
