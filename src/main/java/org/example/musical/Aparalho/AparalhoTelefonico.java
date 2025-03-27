package org.example.musical.Aparalho;

 interface AparalhoTelefonico {
}

class Telefone implements AparalhoTelefonico {
     public void ligar(String numero){
         System.out.println("Ligando: " + numero);
     }
    public void atender(){
         System.out.println("Atender");
    }
    public void iniciarCorreioDeVoz(){
         System.out.println("Iniciando Correio de Voz");
    }

}
