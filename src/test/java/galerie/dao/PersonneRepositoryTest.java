/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.dao;

import lombok.extern.log4j.Log4j2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

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
    public void onCompteLesEnregistrements(){
        log.info("on compte les enregistrements de la table personne");
        int combienDansLeJeuTest = 2;
        long nombre = personneDAO.count();
        assertEquals(combienDansLeJeuTest, nombre, "on doit trouver 2 personne");
    }
    
}
