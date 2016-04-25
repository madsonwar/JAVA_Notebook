package br.ufpa.cbcc.Notebook;

public class Notebook extends ComputadorPortatil{
	
	Notebook(){
		this.voltagem =0;
	}
	Notebook(String entradaMarc, String entradaProg, boolean entradaOnoff, 
			int entradaVol,String nave,int entradaBateria,boolean ligarNaTomada,float entradaVoltagem){
		super(entradaMarc,entradaProg,entradaOnoff,entradaVol,nave,entradaBateria,ligarNaTomada);
		
		this.voltagem = entradaVoltagem;
	
	}
	
	private float voltagem;
	@Override
	public void ligarDesligar() {
		
			
			if((getBateria()>0 || isLigadoTomada())){
				setLigado(!isLigado());
				System.out.println(isLigado() ? "O Notebook foi ligado!" : "O Notebook foi desligado!");
				setBateria(isLigadoTomada() ? getBateria()-0 : getBateria()-10);
			}
			
		
		
	}

	@Override
	public void aumentarVolume() {
		
		if(isLigado()){
			setVolume(getVolume()+2);
			System.out.println("O Volume foi aumentado em 2:"+getVolume());
			setBateria(isLigadoTomada() ? getBateria()-0 : getBateria()-10);
		}
		else{
			System.out.println("O Notebook estah desligado!!!");
		}
	}

	@Override
	public void diminuirVolume() {
		
		if(isLigado()){
			setVolume(getVolume()-2);
			System.out.println("O Volume foi diminuido em 2:"+getVolume());
			setBateria(isLigadoTomada() ? getBateria()-0 : getBateria()-10);
		}
		else{
			System.out.println("O Notebook estah desligado!!!");
		}
	}

	@Override
	public void printfMarca() {
		System.out.println(isLigado()? "A marca do PC eh:"+getMarca() : "O Notebook estah desligado!");
		
	}

	@Override
	public void executarPrograma() {
		System.out.println(isLigado()? "O programa"+getPrograma()+"esta executando":"O Notebook estah desligado!");
		
		
	}

	@Override
	public void printfVersaoDaBios() {
		System.out.println(isLigado()? "A versão da bios eh:"+getVersaoDaBios():"O Notebook estah desligado!!");
		
	}

	@Override
	public void aumentarVolume(int mais) {
		if(isLigado()){
			
			setVolume(getVolume()+mais);
			System.out.println("O volume foi aumentado:"+getVolume());
		
		}
		else{
			System.out.println("O PC estah Desligado!!");
		}
		
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

	@Override
	public void ligarDesligarTomada() {
		
		setLigadoTomada(isLigadoTomada() ? false:true); 
		setBateria(isLigadoTomada() ? (getBateria()+40) : 0);
		
	}
	public float getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(float voltagem) {
		this.voltagem = voltagem;
	}

	

}
