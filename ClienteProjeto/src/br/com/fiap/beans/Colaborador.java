package br.com.fiap.beans;

public class Colaborador {

	private String nome;
	private String cargo;
	private double valorHora;
	private double quantidadeHora;
	
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public double getQuantidadeHora() {
		return quantidadeHora;
	}
	public void setQuantidadeHora(double quantidadeHora) {
		this.quantidadeHora = quantidadeHora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	//get com mais de um atributo
	public String getTudo() {
		return "\nNome: " + nome + "\nCargo: " + cargo + "\nValor da hora: " +  valorHora + "\nQuantidade de horas: " + quantidadeHora; 
	}
	//metodo worker
		public double calcularSalario() {
			return valorHora * quantidadeHora;
			}
			
			
			//Metodo if else
			public String pagarTaxa() {
				if(calcularSalario() > 17500.55) {
					return "Paga taxa";
				}else {
					return "Não paga taxa";
			}
				
			}
			
}
