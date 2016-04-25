package br.ufpa.cbcc.Notebook;
public class Main{
public static void main(String[] args){
  
  Notebook noote = new Notebook("POSITIVO", "Avira", true, 100,"Google Chrome",50,true,150);
   

  /*computadorpessoal.aumentarVolume(5);
  computadorpessoal.aumentarVolume(10);
  computadorpessoal.ligarDesligar();
  computadorpessoal.ligarDesligar();*/
  
  noote.aumentarVolume();
  noote.ligarDesligarTomada();
  noote.ligarDesligarTomada();
  
  
  }
}
