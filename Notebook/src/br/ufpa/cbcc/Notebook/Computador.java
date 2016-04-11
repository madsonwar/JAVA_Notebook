package br.ufpa.cbcc.Notebook;

public abstract class Computador implements Device{
	private int versaoDaBios;
	private String programa;
	private boolean ligado;
	private int volume;
	private String marca;
	
	public abstract void executarPrograma();
	public abstract void printfVersaoDaBios();
	
	
	public  void aumentarVolume(){
		volume +=1;
		System.out.println("O volume foi aumentado:"+volume);
	}
	
	
	
	
	public int getVersaoDaBios() {
		return versaoDaBios;
	}
	public void setVersaoDaBios(int versaoDaBios) {
		this.versaoDaBios = versaoDaBios;
	}
	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	

}
