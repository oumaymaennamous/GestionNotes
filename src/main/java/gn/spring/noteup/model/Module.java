package gn.spring.noteup.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="Module")
@Data @NoArgsConstructor @AllArgsConstructor
public class Module implements Serializable {
    @Id()
    private String CodeModule;
    @Column(nullable = false)
    private String NameModule;
    @OneToMany(mappedBy = "module",cascade = CascadeType.ALL,fetch=FetchType.LAZY)
    private List<ElementModule> elementModuleList;
    @OneToMany(mappedBy = "module",cascade = CascadeType.ALL,fetch=FetchType.LAZY)
    private List<Module_Filieres> moduleFilieresList;

}
