package org.example.musical.Navegador;

 interface Internet {
}
class Aba implements Internet {

     public void exibirPagina(String url){
         System.out.println("Aba" + url);
     }
     public void adicionarNovaAba(){
         System.out.println("Adicionar nova aba");
     }
  public void atualizarPagina(){
      System.out.println("atualizando pagina");
  }
}
