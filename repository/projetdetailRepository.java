package tn.esprit.worksho5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.worksho5.entities.Projetdetail;

import java.util.List;

public interface projetdetailRepository extends JpaRepository<Projetdetail,Long>{

    //1)afficher la liste des projet qui on une technologie precise
    List<Projetdetail> findByTechnologieLike(String technologie);
}
