package gn.spring.noteup.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Etudiant  implements Serializable {
    @Id
    private long CodeEtudiant;

    private String nom;
    private String prenom;
    @Column(unique = true)
    private String CNE;
    @Column(unique = true)
    private String CIN;


    @ManyToOne
    private Filieres filiere;

    @OneToMany(mappedBy = "etudiant",cascade = CascadeType.ALL,fetch= FetchType.LAZY)
    private List<ModeEvalution> modeEvalutionList;

}
