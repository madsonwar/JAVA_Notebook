package br.ufpa.cbcc.Notebook;

public class ComputadorPessoal extends Computador{

	
	private String navegador;
	
	
    ComputadorPessoal(){
    	
    }
	
    ComputadorPessoal(String entradaMarc, String entradaProg, boolean entradaOnoff, int entradaVol,String nave){
    	super(entradaMarc,entradaProg,entradaOnoff,entradaVol);
    	
    	navegador = nave;
    	
    }
	
	
	
	
	public  void aumentarVolume(int mais){
		
		setVolume(getVolume()+mais);
		System.out.println("O volume foi aumentado:"+getVolume());
	}
	
	
	@Override
	public void ligarDesligar() {
		if(isLigado()){
			setLigado(false);
			System.out.println("O PC foi desligado!!");
		}
		else {
			setLigado(true);
			System.out.println("O PC foi ligado!!");
		
			
		}
		
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
	public void diminurVolume(int menos) {
		// TODO Auto-generated method stub
		
	}

	public String getNavegador() {
		return navegador;
	}

	public void setNavegador(String navegador) {
		this.navegador = navegador;
	}

}
