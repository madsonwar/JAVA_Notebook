package br.ufpa.cbcc.Notebook;

public class Notebook extends ComputadorPortatil{
	
	
	
	@Override
	public void ligarDesligar() {
		
			
			System.out.println((getBateria()>0 || isLigadoTomada()) ? (isLigado()+"Notebook foi ligado com sucesso!!") :"Tentando ligar, mas não consigo!" );
		
		
	}

	@Override
	public void aumentarVolume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void diminuirVolume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printfMarca() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executarPrograma() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printfVersaoDaBios() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aumentarVolume(int mais) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void diminurVolume(int menos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ligarDesligarTomada() {
		// TODO Auto-generated method stub
		
		setLigadoTomada(isLigadoTomada() ? false:true); 
		setBateria(isLigadoTomada() ? (getBateria()+40) : 0);
		
	}

	

}
