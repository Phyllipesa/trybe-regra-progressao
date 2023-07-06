package com.trybe.java.regraprogressao;

public class Atividade {
  private String nome;
  private String peso;
  private String nota;

  /**
   * Construtor.
   * @param nome nome
   * @param peso peso
   * @param nota nota
   */
  public Atividade(String nome, String peso, String nota) {
    this.nome = nome;
    this.peso = peso;
    this.nota = nota;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getPeso() {
    return peso;
  }

  public void setPeso(String peso) {
    this.peso = peso;
  }

  public String getNota() {
    return nota;
  }

  public void setNota(String nota) {
    this.nota = nota;
  }
}
