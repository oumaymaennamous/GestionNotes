package gn.spring.noteup.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name ="Professeur")
@Data @NoArgsConstructor @AllArgsConstructor
public class Professeur implements Serializable {
    @Id()
    private String code ;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String prenom;
    @Column(nullable = false)
    private String  spécialité;
    @OneToMany(mappedBy = "professeur" ,cascade = CascadeType.ALL,fetch=FetchType.LAZY)

    private List<ElementModule> elementModules;

}
