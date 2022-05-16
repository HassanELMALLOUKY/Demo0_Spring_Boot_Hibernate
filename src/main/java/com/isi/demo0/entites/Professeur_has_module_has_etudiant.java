package com.isi.demo0.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Professeur_has_module_has_etudiant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfesseur_has_module_has_etudiant;
    @ManyToOne
    private CoursTDTP coursTDTP;
    @ManyToOne
    private Etudiant etudiant;
    @ManyToOne
    private ProfesseurHasModule professeurHasModule;

}
