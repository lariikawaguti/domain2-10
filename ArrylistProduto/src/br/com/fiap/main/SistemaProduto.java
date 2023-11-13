package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class SistemaProduto {
	
	//String
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	//int
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	//double
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	//valor total
	static double valorTotal (List<Produto> lp, Produto p) {
		double total =0;
		
		for(Produto pr: lp) {
			total += pr.getValor() * pr.getQuantidade();
			
		}
		return total;
	}

	
	public static void main(String[] args) {
    // Instanciar //ctrl shift o ---> import
		List<Produto> listaProdutos = new ArrayList<Produto>();
		
		Produto objetoProduto;
		do {
			objetoProduto = new Produto();
			objetoProduto.setCodigo(inteiro("Informe o codigo do produto"));
			objetoProduto.setTipo(texto("Digite o tipo de produto"));
			objetoProduto.setMarca(texto("Marca"));
			objetoProduto.setQuantidade(inteiro("Quantidade"));
			objetoProduto.setValor(real("Valor do produto"));
			listaProdutos.add(objetoProduto);
			
			
		}while(JOptionPane.showConfirmDialog(null, "Adicionar mais produto no carrinho?",
		"CARRINHO DE COMPRAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);
		
		//Saidas
		//O foreach percorre todos os elementos do produto para serem exibidos.
		for(Produto produto : listaProdutos) {
			System.out.println("\n\nCodigo: " + produto.getCodigo()+
					           "\nTipo: " + produto.getTipo() +
					           "\nMarca: " + produto.getMarca() +
					           "\nQuantidade: " + produto.getQuantidade()+
					           "\nValor: " + produto.getValor());
		}
		
		System.out.println("\n\n\nVALOR TOTAL: " + valorTotal(listaProdutos,objetoProduto));

	}

}
