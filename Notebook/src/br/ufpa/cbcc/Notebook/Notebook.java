package br.ufpa.cbcc.Notebook;
import javax.swing.JOptionPane;

public class Notebook extends ComputadorPortatil{
	
	Notebook(){
		this.voltagem =0;
	}
	Notebook(String entradaMarc, String entradaProg, boolean entradaOnoff, 
			int entradaVol,String nave,int entradaBateria,boolean ligarNaTomada,float entradaVoltagem){
		super(entradaMarc,entradaProg,entradaOnoff,entradaVol,nave,entradaBateria,ligarNaTomada);
		
		this.voltagem = entradaVoltagem;
	
	}
	Notebook(Notebook not){
		super(not);
		this.voltagem = not.voltagem;
	}
	private float voltagem;
	@Override
	public void ligarDesligar() {
		
			
			if((getBateria()>0 || isLigadoTomada())){
				setLigado(!isLigado());
				System.out.println(isLigado() ? "O Notebook foi ligado!" : "O Notebook foi desligado!");
				setBateria(isLigadoTomada() ? getBateria()-0 : getBateria()-10);				
			}
			else {
				System.out.println("Tentando ligar, mas estah sem bateria e a tomada estah desligada!");
			}
		
		
	}

	@Override
	public void aumentarVolume() {
		
		if(isLigado()){
			setVolume(getVolume()+2);
			System.out.println("O Volume foi aumentado:"+getVolume());
			setBateria(isLigadoTomada() ? getBateria()-10 : getBateria()-0);
			setLigado(isLigadoTomada()&& getBateria()<=0? false : isLigado());
			
		}
		else{
			System.out.println("O Notebook estah desligado!!!");
		}
	}

	@Override
	public void diminuirVolume() {
		
		if(isLigado()){
			setVolume(getVolume()-2);
			System.out.println("O Volume foi diminuido:"+getVolume());
			setBateria(isLigadoTomada() ? getBateria()-10 : getBateria()-0);
			setLigado(isLigadoTomada()&& getBateria()<=0? false : isLigado());
		}
		else{
			System.out.println("O Notebook estah desligado!!!");
		}
	}

	@Override
	public void printfMarca() {
		System.out.println(isLigado()? "A marca do PC eh:"+getMarca() : "O Notebook estah desligado!");
		setBateria(isLigadoTomada()? getBateria()-10:getBateria()-0);
		setLigado(isLigadoTomada()&& getBateria()<=0? false : isLigado());
	}

	@Override
	public void executarPrograma() {
		System.out.println(isLigado()? "O programa"+getPrograma()+"esta executando":"O Notebook estah desligado!");
		setBateria(isLigadoTomada()? getBateria()-10:getBateria()-0);
		setLigado(isLigadoTomada()&& getBateria()<=0? false : isLigado());
		
	}

	@Override
	public void printfVersaoDaBios() {
		System.out.println(isLigado()? "A versão da bios eh:"+getVersaoDaBios():"O Notebook estah desligado!!");
		setBateria(isLigadoTomada()? getBateria()-10:getBateria()-0);
		setLigado(isLigadoTomada()&& getBateria()<=0? false : isLigado());
	}

	public void aumentarVolume(int mais) {
		if(isLigado()){
			
			setVolume(getVolume()+mais);
			System.out.println("O volume foi aumentado:"+getVolume());
			setBateria(isLigadoTomada()? getBateria()-10:getBateria()-0);
			setLigado(isLigadoTomada()&& getBateria()<=0? false : isLigado());
		}
		else{
			System.out.println("O PC estah Desligado!!");
		}
		
	}

	public void diminurVolume(int menos) {
		if(isLigado()){
			try{
				if(menos <0){
					String str = "numero invalido";
					 throw new IllegalArgumentException ( str );
				
				}
				
			}
			
			catch ( IllegalArgumentException iae ){
				
				 JOptionPane.showMessageDialog(null,iae.getMessage(),"Erro",0);}
			setVolume(getVolume()-menos);
			System.out.println("O volume foi diminuido:"+getVolume());
			setBateria(isLigadoTomada()? getBateria()-10:getBateria()-0);
			setLigado(isLigadoTomada()&& getBateria()<=0? false : isLigado());
		}
		else{
			System.out.println("O PC estah Desligado!!");
		}		
	}

	public void ligarDesligarTomada() {
		
		setLigadoTomada(isLigadoTomada() ? false:true); 
		setBateria(isLigadoTomada() ? (getBateria()+40) : getBateria());
		setLigado(isLigadoTomada()&& getBateria()<=0? false : isLigado());
		
	}
	public float getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(float voltagem) {
		this.voltagem = voltagem;
	}

	public void printfBateria(){
		System.out.println("A bateria estah em:"+getBateria());
	}

}
