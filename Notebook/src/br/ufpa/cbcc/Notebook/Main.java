package br.ufpa.cbcc.Notebook;
public class Main{
public static void main(String[] args){
  ComputadorPessoal computadorpessoal = new ComputadorPessoal();
  ComputadorPessoal Hp = new ComputadorPessoal("Hp", "Avast", false, 100,"Mozila");
  
  computadorpessoal.ligarDesligar();
  Hp.getMarca();
  computadorpessoal.aumentarVolume(5);
  computadorpessoal.aumentarVolume(10);
  
  computadorpessoal.getVolume();
  
  
  

  }
}
