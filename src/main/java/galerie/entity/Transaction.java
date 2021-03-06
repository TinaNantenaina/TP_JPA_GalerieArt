/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;

import java.time.LocalDate;
import javax.persistence.*;
import lombok.*;

/**
 *
 * @author TinaNantenaina
 */
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Transaction {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column(unique=true)
    @NonNull
    private LocalDate venduLe;
    
    @Column
    @NonNull
    private Float prixVente;
    
    // relation Transaction - tableau
    @OneToOne
    @NonNull
    private Tableau oeuvre;
    
    // relation Transaction - Personne
    @ManyToOne
    private Personne client;
    
    // relation transaction - Exposition
    @ManyToOne
    private Exposition lieuDeVente;
    
    
    
}
