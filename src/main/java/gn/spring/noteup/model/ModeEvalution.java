package gn.spring.noteup.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
public class ModeEvalution  implements Serializable {
    @Id
    private String codeMode;
    private String Type;
    private double Coefficient;
    private String status;
    private double Note;
    @ManyToOne
    private Etudiant etudiant;

}
