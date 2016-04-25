package br.ufpa.cbcc.Notebook;

public class Data {
	private int dia;
	private int	mes;
	private int ano;
	
	Data(int entradaDia,int entradaMes,int entradaAno){
		this.dia = entradaDia;
		this.mes = entradaMes;
		this.ano = entradaAno;
	
	}
	Data(){
		this.dia = 1;
		this.mes = 1;
		this.ano = 1;
	}
	
	Data(Data objData){
		this.dia = objData.dia;
		this.mes = objData.mes;
		this.ano = objData.ano;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
