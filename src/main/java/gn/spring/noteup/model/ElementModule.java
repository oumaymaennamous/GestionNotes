package gn.spring.noteup.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Entity
@Table(name="ElementModule")
@Data @NoArgsConstructor @AllArgsConstructor
public class ElementModule implements Serializable {
    @Id
    private String codeElementModule;
    @Column(nullable = false)
    private String nameElementModule;
    private double Coefficient;
    @ManyToOne
    private Professeur professeur;
    @ManyToOne
    private Module module;
}
