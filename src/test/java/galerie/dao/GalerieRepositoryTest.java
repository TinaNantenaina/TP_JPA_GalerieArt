package galerie.dao;

import galerie.entity.Galerie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.jdbc.Sql;
import galerie.dao.GalerieRepository;
import java.util.List;


@Log4j2 // Génère le 'logger' pour afficher les messages de trace
@DataJpaTest
public class GalerieRepositoryTest {

    @Autowired
    private GalerieRepository galerieDAO;
    
    

    @Test
    //@Sql("test-galerie-data.sql") // On peut charger des donnnées spécifiques pour un test
    public void onSaitCompterLesEnregistrements() {
        log.info("On compte les enregistrements de la table 'Galerie'");
        int combienDansLeJeuDeTest = 2; 
        long nombre = galerieDAO.count();
        assertEquals(combienDansLeJeuDeTest, nombre, "On doit trouver 2 galerie" );
    }

    @Test
    //@Sql("test-galerie-data.sql")
    public void afficheListEnregistrement(){
        log.info("on affiche liste des enregistrements dans classe galérie");
        List<Galerie> galeries = galerieDAO.findAll();
        log.info("liste des galerie : {}", galeries);
        
    }
    
}
