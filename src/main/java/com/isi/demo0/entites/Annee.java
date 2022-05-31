package com.isi.demo0.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Annee implements Serializable {
    @Id
    @GeneratedValue
    private int idAnnee;
    private String annee;
    @OneToMany(mappedBy = "annee")
    private Collection<ProfesseurHasModule> professeurHasModules;

}
