/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;
import java.util.*;
import javax.persistence.*;
import lombok.*;

/**
 *
 * @author TinaNantenaina
 */
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Personne {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column(unique=true)
    @NonNull
    private String nom;
    
    @Column(unique=true)
    @NonNull
    private String adresse;
    
    // relation Personne - Transaction
    @OneToMany (mappedBy="client")
    @NonNull
    private List<Transaction> achats = new LinkedList<>(); 
    
    // implementation methode budgetArt
    public float budgetArt(int annee){
        float ba = 0;
        for(Transaction transaction : achats){
            if(transaction.getVenduLe().getYear()== annee)
                ba+= transaction.getPrixVente();
        }
        return ba;
    }   
}
