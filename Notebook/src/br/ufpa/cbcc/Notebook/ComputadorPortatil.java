package br.ufpa.cbcc.Notebook;

public abstract class ComputadorPortatil extends Computador{
	ComputadorPortatil(){
		bateria = 0;
		ligadoTomada = false;
	}
	ComputadorPortatil(String entradaMarc, String entradaProg, boolean entradaOnoff, int entradaVol,String nave,int entradaBateria,boolean ligarNaTomada){
		super(entradaMarc, entradaProg,entradaOnoff, entradaVol);
		bateria = entradaBateria;
		ligadoTomada = ligarNaTomada;
	}
	
	
	private int bateria;
	private boolean ligadoTomada;
	
	public abstract void ligarDesligarTomada();
	
	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public boolean isLigadoTomada() {
		return ligadoTomada;
	}

	public void setLigadoTomada(boolean ligadoTomada) {
		this.ligadoTomada = ligadoTomada;
	}
	

}
