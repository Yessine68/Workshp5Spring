package tn.esprit.worksho5.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
public class Entreprise implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "idEntreprise")
    private long idEntreprise;
    private String nomE;
    private String adresseE;
    @OneToMany (cascade = CascadeType.ALL , mappedBy = "entreprise")
    Set<Equipe> equipes;

}
