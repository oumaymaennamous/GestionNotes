package gn.spring.noteup.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Filieres implements Serializable {
    @Id
    private String CodeFiliere;
    private String NomFiliere;
    private int Niveau;

    @OneToMany(mappedBy = "filiere",cascade = CascadeType.ALL,fetch= FetchType.LAZY)
    private List<Module_Filieres> moduleFilieresList;
    @OneToMany(mappedBy = "filiere",cascade = CascadeType.ALL,fetch= FetchType.LAZY)
    private List<Etudiant> EtudiantList;
}

