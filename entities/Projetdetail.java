package tn.esprit.worksho5.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter

public class Projetdetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProjetDetail")
    private Long idProjetDetail;
    private String description;
    private String technologie;
    private int cout_provisoir;
    @Temporal(TemporalType.DATE)
    private Date dateDebut;

    @OneToOne( mappedBy = "projetD")
    private Projet projet;


}
