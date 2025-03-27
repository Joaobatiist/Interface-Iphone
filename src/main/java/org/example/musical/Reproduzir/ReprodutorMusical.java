package org.example.musical.Reproduzir;

import java.util.Scanner;


interface Reproduzir{
void tocar();
void pausar();
void selecionarMusica();

}
class ReprodutorMusical implements  Reproduzir {
    @Override
   public  void tocar(){
        System.out.println("Play na Musica");

    }

    @Override
    public void pausar(){
        System.out.println("Musica Pausada");
    }

    @Override
    public void selecionarMusica() {
        Scanner sc = new Scanner(System.in);
        String [] musica = new String[] {"two feet", "Edson Gomes"};
        System.out.println("Selecione uma música: ");

        for (int i = 0; i < musica.length; i++) {
            System.out.println((i + 1) + ". " + musica[i]);
        }
        int escolha = sc.nextInt();

        if (escolha >= 0 && escolha <= musica.length) {
            System.out.println("Tocando: " + musica[escolha - 1]);
        } else {
            System.out.println("Escolha inválida.");
        }
    }


}
