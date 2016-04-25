package br.ufpa.cbcc.Notebook;

public class Modem {
	private boolean ethernet;
	private boolean adsl;
	private boolean internet;
	Modem(boolean entradaEthernet,boolean entradaAdsl,boolean entradaInternet){
		this.ethernet=entradaEthernet;
		this.adsl=entradaAdsl;
		this.internet=entradaInternet;
	}
	Modem(){
		this.adsl = true;
		this.ethernet = true;
		this.internet = true;
	}
	public boolean conectividade(){
		return(adsl&&ethernet&&internet? true : false);
	}
	public boolean isEthernet() {
		return ethernet;
	}
	public void setEthernet(boolean ethernet) {
		this.ethernet = ethernet;
	}
	public boolean isAdsl() {
		return adsl;
	}
	public void setAdsl(boolean adsl) {
		this.adsl = adsl;
	}
	public boolean isInternet() {
		return internet;
	}
	public void setInternet(boolean internet) {
		this.internet = internet;
	}

}
