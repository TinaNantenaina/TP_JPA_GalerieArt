 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.dao;

import galerie.entity.Exposition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Tina Nantenaina
 */
public interface ExpositionRepository extends JpaRepository<Exposition, Integer> {
   
    /**
     * Calculer le chiffre d'affaires pour une exposition
     * @param id la clé primaire de l'exposition
     * @return le chiffre d'affaires de cette exposition
     
    @Query("SELECT SUM(transaction.prixVente) as ca"
          + "FROM transaction"
          + "WHERE transaction.lieuDeVente.id = :id")
    float chiffreAffairePour(Integer id);
    */
}

