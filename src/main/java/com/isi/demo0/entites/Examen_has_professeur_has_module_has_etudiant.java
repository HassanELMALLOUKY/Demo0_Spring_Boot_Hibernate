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
public class Examen_has_professeur_has_module_has_etudiant implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idExamen_has_professeur_has_module_has_etudiant;
    @ManyToOne
    private Examen examen;
    @ManyToOne
    private Professeur_has_module_has_etudiant professeur_has_module_has_etudiant;

}
