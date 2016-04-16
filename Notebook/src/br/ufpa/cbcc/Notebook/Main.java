package br.ufpa.cbcc.Notebook;
public class Main{
public static void main(String[] args){
  ComputadorPessoal computadorpessoal = new ComputadorPessoal();
  ComputadorPessoal Hp = new ComputadorPessoal("Hp", "Avast", false, 100,"Mozila");
  Notebook noote = new Notebook("POSITIVO", "Avira", true, 100,"Google Chrome",50,true,150);
  computadorpessoal.ligarDesligar();
  System.out.println("A marca eh:"+Hp.getMarca()); 

  /*computadorpessoal.aumentarVolume(5);
  computadorpessoal.aumentarVolume(10);
  computadorpessoal.ligarDesligar();
  computadorpessoal.ligarDesligar();*/
  
  noote.aumentarVolume();

  }
}
