package org.example.musical.Reproduzir;


import java.util.Scanner;

public class HelloApplication {
   public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
      ReprodutorMusical rm = new ReprodutorMusical();
      String opcoes = sc.nextLine();
      String [] musica = new String [0] ;

          switch(opcoes){
              case "1":
                  rm.tocar();
                  break;
              case "2":
                  rm.pausar();
                  break;
              case "3":
                  rm.selecionarMusica();
                  break;
              default:
                  System.out.println("Escolha inválida.");
                  break;

          }
      }



}