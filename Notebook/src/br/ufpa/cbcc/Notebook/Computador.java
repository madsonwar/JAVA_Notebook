package br.ufpa.cbcc.Notebook;

public abstract class Computador implements Device,Autenticavel{
	private int versaoDaBios;
	private String programa;
	private boolean ligado;
	private int volume;
	private String marca;
	private Data dataDeFabricacao;
	private String usuario;
	private int senha = 12345;
	public abstract void executarPrograma();
	public abstract void printfVersaoDaBios();
	
	
	Computador(){
		marca = "desconhecido";
		programa = "desconhecido";
		ligado = false;
		volume = 0;
		
	}
	
	Computador(String marc, String prog, boolean onoff, int vol){
		marca = marc;
		programa = prog;
		ligado = onoff;
		volume = vol;
		
	}
	Computador(Computador comp){
		this.marca = comp.marca;
		this.programa = comp.programa;
		this.ligado = comp.ligado;
		this.volume = comp.volume;
	}
	
	public  void aumentarVolume(){
		volume +=1;
		System.out.println("O volume foi aumentado:"+volume);
	}
	
	public void ligarDesligar(){
		ligado=!ligado;
		System.out.println(ligado? "O Computador foi ligado!":"O Computador foi desligado!");
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
	public Data getDataDeFabricacao() {
		return dataDeFabricacao;
	}
	public void setDataDeFabricacao(Data dataDeFabricacao) {
		this.dataDeFabricacao = dataDeFabricacao;
	}
	public void logar(){
		
		
	}
	public void desLogar(){
		
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}

}
