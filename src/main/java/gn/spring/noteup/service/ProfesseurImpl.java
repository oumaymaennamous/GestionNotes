package gn.spring.noteup.service;

import gn.spring.noteup.dto.ProfesseurRequestDto;
import gn.spring.noteup.dto.ProfesseurResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProfesseurImpl implements ProfesseurService{
    @Override
    public ProfesseurResponseDto save(ProfesseurRequestDto professeurRequestDto) {
        return null;
    }

    @Override
    public ProfesseurResponseDto findById(String code) {
        return null;
    }

    @Override
    public ProfesseurResponseDto findByNom(String nom) {
        return null;
    }

    @Override
    public void delete(String code) {

    }

    @Override
    public List<ProfesseurResponseDto> findAll() {
        return List.of();
    }

    @Override
    public ProfesseurResponseDto update(ProfesseurRequestDto professeurRequestDto, String code) {
        return null;
    }
}
