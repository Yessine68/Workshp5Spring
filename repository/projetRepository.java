package tn.esprit.worksho5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.worksho5.entities.Projet;
import tn.esprit.worksho5.entities.Projetdetail;

import java.util.List;
import java.util.Set;

public interface projetRepository extends JpaRepository<Projet,Long> {


    //3)afficher la liste de projet dune equipe dont la description est non nuoll
   List<Projet> findByEquipesIdEquipeAndProjetDDescriptionNotNull(Long IdEquipe);


   //4)affiche la liste des projet par equipe et entreprise
    List<Projet> findByEquipesIdEquipeAndEquipesEntrepriseIdEntreprise(Long IdEquipe, Long entrepriseId);

    // 2) afficher la liste des projet dune equipe
    List<Projet> findByEquipesIdEquipe (Long IdEquipe);


    //5) afficher la liste des projet par spécialité d'une equipe et ladresse dentreprise
    List<Projet> findByEquipesSpecialiteEquipeContainsAndEquipesEntrepriseAdresseEContains(String specialiteEquipe, String adresseE);

}
