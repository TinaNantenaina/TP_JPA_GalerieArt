/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;

import javax.persistence.*;
import lombok.*;

/**
 *
 * @author TinaNantenaina
 */
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity

public class Artist extends Personne{
    
    @Column
    @NonNull
    private String biographie;
    
}
