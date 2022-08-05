package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface IAvaliacaoFisicaService {
  
  AvaliacaoFisica create(AvaliacaoFisicaForm form);

  AvaliacaoFisica get(Long id);

  List<AvaliacaoFisica> getAll();

  AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

  void delete(Long id);
}
