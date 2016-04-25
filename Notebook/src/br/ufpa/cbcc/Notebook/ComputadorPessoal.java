package br.ufpa.cbcc.Notebook;

public class ComputadorPessoal extends Computador{

	
	private String navegador;
	
	
    ComputadorPessoal(){
    	super();
    	this.navegador = "Desconhecido";
    }
	
    ComputadorPessoal(String entradaMarc, String entradaProg, boolean entradaOnoff, int entradaVol,String nave){
    	super(entradaMarc,entradaProg,entradaOnoff,entradaVol);
    	
    	this.navegador = nave;
    	
    }
	
	
	
	
	public  void aumentarVolume(int mais){
		if(isLigado()){
		
			setVolume(getVolume()+mais);
			System.out.println("O volume foi aumentado:"+getVolume());
		
		}
		else{
			System.out.println("O PC estah Desligado!!");
		}
	}
	
	
	@Override
	public void ligarDesligar() {
		setLigado(!isLigado());
		System.out.println(isLigado() ? "O pc ligado!!" : "O PC foi desligado!!");
	}

	@Override
	public void aumentarVolume() {
		if(isLigado()){
			setVolume(getVolume()+3);
			System.out.println("O volume foi aumentado em:"+getVolume());
		}
		
		else{
			System.out.println("O PC estah Desligado!!");
		}
		
	}

	@Override
	public void diminuirVolume() {
		if(isLigado()){
			setVolume(getVolume()-3);
			System.out.println("O volume foi diminuido em:"+getVolume());
		}
		
		else{
			System.out.println("O PC estah Desligado!!");
		}
		
	}

	@Override
	public void printfMarca() {
		System.out.println(isLigado()? 
				"A marca do PC eh:"+getMarca() 
				: "O PC estah desligado");
		
		
	}

	@Override
	public void executarPrograma() {
		System.out.println(isLigado()? "O programa:"+getPrograma()+"Estah sendo executado" : "O PC estah desligado!");
		
		
	}

	@Override
	public void printfVersaoDaBios() {
		System.out.println(isLigado()? "A versao da bios eh:"+getVersaoDaBios():"O PC estah desligado!");
		
	}

	

	@Override
	public void diminurVolume(int menos) {
		if(isLigado()){
			
			setVolume(getVolume()-menos);
			System.out.println("O volume foi diminuido:"+getVolume());
		
		}
		else{
			System.out.println("O PC estah Desligado!!");
		}
		
	}
	public void usarNavegador(){
		if(isLigado()){
			System.out.println(conectarAInternet()? "Utilizando o Navegador"+navegador:"tentando utilizar o navegador, mas estah sem internet");
		}
	}
	public boolean conectarAInternet(){
		
		return true;
	}
	public String getNavegador() {
		return this.navegador;
	}

	public void setNavegador(String navegador) {
		this.navegador = navegador;
	}

}
