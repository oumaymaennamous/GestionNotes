package gn.spring.noteup.service;

import gn.spring.noteup.dto.ProfesseurRequestDto;
import gn.spring.noteup.dto.ProfesseurResponseDto;

import java.util.List;

public interface ProfesseurService {
  public ProfesseurResponseDto save(ProfesseurRequestDto professeurRequestDto);
  public ProfesseurResponseDto findById(String code);
  public ProfesseurResponseDto findByNom(String nom);
  void delete(String code);
  public List<ProfesseurResponseDto> findAll();
  public ProfesseurResponseDto update(ProfesseurRequestDto professeurRequestDto, String code);


}
