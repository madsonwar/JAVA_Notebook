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
				setBateria(getBateria()-10);
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
	public float getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(float voltagem) {
		this.voltagem = voltagem;
	}

	

}
