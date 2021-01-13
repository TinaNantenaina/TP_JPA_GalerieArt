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
public class Tableau {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(unique=true)
    @NonNull
    private String titre;
    
    @Column(unique=true)
    @NonNull
    private String support;
    
    @Column(unique=true)
    @NonNull
    private Integer largeur;
    
    @Column(unique=true)
    @NonNull
    private Integer hauteur;
    
    // relation tableau - exposition
    @ManyToMany (mappedBy = "oeuvres")
    private List<Exposition> accrochage = new LinkedList<>(); 
    
    // relation tableau - artiste
    @ManyToOne
    private Artist auteur; 
    
    // relation tableau - Transaction
    @OneToOne (mappedBy="oeuvre")
    private Transaction vendu;
            
}
