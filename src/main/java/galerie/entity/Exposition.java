/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;

import java.time.LocalDate;
import java.util.*;
import javax.persistence.*;
import lombok.*;

/**
 *
 * @author TinaNantenaina
 */
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Exposition {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(unique=true)
    @NonNull
    private LocalDate debut;
    
    @Column(unique=true) 
    @NonNull
    private String intitule;
    
    @Column(unique=true)
    @NonNull
    private Integer duree;
    
    // relation Galerie - exposition
    @ManyToOne
    @NonNull
    private Galerie organisateur;
    
    // relation exposition _ tableau
    @ManyToMany
    private List<Tableau> oeuvres = new LinkedList<>(); 
    
    // relation exposition - Transaction
    @OneToMany (mappedBy="lieuDeVente")
    private List<Transaction> ventes = new LinkedList<>(); 
    

    
    
    
    
}
