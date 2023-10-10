package tn.esprit.worksho5.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
public class Projet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProjet")
    private Long idProjet;
    private String sujetP;
    @OneToOne
    private Projetdetail projetD;
    @ManyToMany(cascade = CascadeType.ALL , mappedBy = "projets")
    private Set<Equipe> equipes;

}
