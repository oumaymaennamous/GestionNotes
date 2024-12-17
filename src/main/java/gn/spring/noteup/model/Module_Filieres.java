package gn.spring.noteup.model;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity

public class Module_Filieres implements Serializable {
       @EmbeddedId
       private Linge_Key id;
       private String semestre;
       private String anneeUnivesitaire;

       @ManyToOne
       @MapsId("CodeFiliere")
       @JoinColumn(name="Code_Filiere")
       private Filieres filiere;

       @ManyToOne
       @JoinColumn(name="Code_Filiere")
       @MapsId("CodeFiliere")
      private Module module ;

}
