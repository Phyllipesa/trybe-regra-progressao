package com.trybe.java.regraprogressao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * App.
 */

public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");;
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    Integer quantidadeDeAtividades = scanner.nextInt();

    List<Atividade> atividades = new ArrayList<>();

    while (atividades.size() < quantidadeDeAtividades) {
      int index = atividades.size() + 1;
      System.out.println("Digite o nome da atividade " + index + ":");
      String atividade = scanner.next();
      System.out.println("Digite o peso da atividade " + index + ":");
      String peso = scanner.next();
      System.out.println("Digite a nota obtida para " + atividade + ":");
      String nota = scanner.next();

      atividades.add(new Atividade(atividade, peso, nota));

    }
  }
}