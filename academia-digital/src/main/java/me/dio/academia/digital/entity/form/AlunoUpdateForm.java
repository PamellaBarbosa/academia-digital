package me.dio.academia.digital.entity.form;

import java.time.LocalDate;

public class AlunoUpdateForm {

  private String nome;

  private String bairro;

  private LocalDate dataDeNascimento;
  

  public String getNome() {
	  return nome;
	}
	
  public void setNome(String nome) {
	  this.nome = nome;
	}
	
  public String getBairro() {
	  return bairro;
	}
	
  public void setBairro(String bairro) {
	  this.bairro = bairro;
	}
	
  public LocalDate getDataDeNascimento() {
	  return dataDeNascimento;
	}
	
  public void setDataDeNascimento(LocalDate dataDeNascimento) {
	  this.dataDeNascimento = dataDeNascimento;
	}
  
  
}
