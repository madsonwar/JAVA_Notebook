package br.ufpa.cbcc.Notebook;
import javax.swing.JFrame;
public interface Device {
	
	public static JFrame frame = new JFrame();
	public abstract void ligarDesligar();
	public abstract void aumentarVolume();
	public abstract void aumentarVolume(int mais);
	public abstract void diminurVolume(int menos);
	public abstract void diminuirVolume();
	public abstract void printfMarca();
	
	
}
