package tn.esprit.worksho5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.worksho5.entities.Entreprise;

public interface entrepriseRepository extends JpaRepository <Entreprise,Long>{
}
