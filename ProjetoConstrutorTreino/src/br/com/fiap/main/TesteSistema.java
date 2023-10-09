package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

public class TesteSistema {

	public static void main(String[] args) {
		
		//Instanciar objetos

		//String razaoSocial, String email, String segmento, int unidade - pegar da classe beans empresa
		Empresa objEmpresa = new Empresa( 
				JOptionPane.showInputDialog("Digite a Razao Social"),
				JOptionPane.showInputDialog("Digite o email"),
				JOptionPane.showInputDialog("Segmento"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite a unidade"))
				);
		
		//String logradouro, String cep, String bairro, int numero 
		Endereco objEndereco = new Endereco(
				JOptionPane.showInputDialog("Informe o logradouro"),
				JOptionPane.showInputDialog("Cep"),
				JOptionPane.showInputDialog("Bairro"),
				Integer.parseInt(JOptionPane.showInputDialog("numero"))
				);
		objEmpresa.setEndereco(objEndereco);
		
		//int codigo, String tipo, String marca, double valor
		Produto objProduto = new Produto(
				Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo do produto")),
				JOptionPane.showInputDialog("Informe o tipo de produto"),
				JOptionPane.showInputDialog("Marca"),
				Double.parseDouble(JOptionPane.showInputDialog("Informe o valor"))
				);
		objEmpresa.setProduto(objProduto);
		
		
		//Saida
		System.out.println("Empresa: " + objEmpresa.getRazaoSocial() +
				"\nEmail: " + objEmpresa.getEmail()+
				"\nSegmento: " + objEmpresa.getSegmento()+
				"\nUnidade: " + objEmpresa.getUnidade()+
				"\nLogradouro: " + objEmpresa.getEndereco().getLogradouro()+
				"\nCep: " + objEmpresa.getEndereco().getCep()+
				"\nBairro: " + objEmpresa.getEndereco().getBairro()+
				"\nNumero: " + objEmpresa.getEndereco().getNumero()+
				"\n\nINFORMAÇÕES DO PRODUTO" +
				"\nCodigo: " + objProduto.getCodigo()+
				"\nTipo: " + objProduto.getTipo()+
				"\nMarca: " + objProduto.getMarca()+
				"\nValor: " + objProduto.getValor());
		
		
		
	}

}
