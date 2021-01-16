/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.dao;

import galerie.entity.Exposition;
import galerie.entity.Galerie;
import java.time.LocalDate;
import java.util.Date;
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
public class ExpositionRepositoryTest {
    @Autowired
    private ExpositionRepository expositionDAO;
    
    
    @Test
    @Sql("test-galerie-data.sql")
    @Sql("test-exposition-data.sql")
    public void onCompteLesEnregistrement(){
        log.info("on compte les enregistrement de la table exposition");
        int combienDansLeJeuDeTest = 1;
        long nombre = expositionDAO.count();
        assertEquals(combienDansLeJeuDeTest, nombre, "on doit trouver 1 expositions");
                           
    }
  
}
