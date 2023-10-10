package tn.esprit.worksho5.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;


@Entity
@Getter
@Setter
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEquipe")
    private Long idEquipe;
    private String nomEquipe;
    private String specialiteEquipe;
    @ManyToOne
    Entreprise entreprise;
    @ManyToMany (cascade =  CascadeType.ALL)
    private Set<Projet> projets;

}
