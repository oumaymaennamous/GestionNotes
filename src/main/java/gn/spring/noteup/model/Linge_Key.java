package gn.spring.noteup.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
@Embeddable
public class Linge_Key implements Serializable {
    @Column(name="Code_Module")
    private String CodeModule;
    @Column(name="Code_Filiere")
    private String CodeFiliere;
}
