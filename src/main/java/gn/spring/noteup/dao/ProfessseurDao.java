package gn.spring.noteup.dao;

import gn.spring.noteup.model.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessseurDao extends JpaRepository<Professeur, String> {
    Professeur findByNom(String nom);
}

