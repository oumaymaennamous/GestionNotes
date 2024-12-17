package gn.spring.noteup.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfesseurRequestDto {
    private String code;
    private String nom;
    private String prenom;
    private String spécialité;
}
