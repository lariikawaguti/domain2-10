package br.com.fiap.beans;

public class Endereco {

	private String logradouro;
	private String cep;
	private String bairro;
	private int numero;
	

	//construtor vazio
	public Endereco() {
		super();
	}


	//construtor cheio
	public Endereco(String logradouro, String cep, String bairro, int numero) {
		super();
		this.logradouro = logradouro;
		this.cep = cep;
		this.bairro = bairro;
		this.numero = numero;
	}


	
	//setters(entrada), getters(saida)
	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	
	
	
	
	
}
