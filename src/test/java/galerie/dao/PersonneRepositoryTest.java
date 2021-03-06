/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.dao;

import galerie.entity.Personne;
import java.util.List;
import lombok.extern.log4j.Log4j2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

/**
 *
 * @author Tina Nantenaina
 */
@Log4j2
@DataJpaTest
public class PersonneRepositoryTest {
    @Autowired
    private PersonneRepository personneDAO;
    
    @Test
   // @Sql("test-personne-data.sql")
    public void onCompteLesEnregistrements(){
        log.info("on compte les enregistrements de la table personne");
         int combienDansLeJeuTest = 1;
        long nombre = personneDAO.count();
        assertEquals(combienDansLeJeuTest, nombre, "on doit trouver 1 personne");
    }
    
    @Test
    public void afficheListEnregistrement(){
        log.info("on affiche la liste des enregistrement de la classe personne");
        List<Personne> personne = personneDAO.findAll();
        log.info("Liste des enregistrements : {}", personne);
    }
}
