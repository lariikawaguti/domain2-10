package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class ClienteTeste {

	public static void main(String[] args) {
		// Instanciar objetos
		Cliente objetoCliente = new Cliente();
		Endereco objetoEndereco = new Endereco();
		Colaborador objetoColaborador = new Colaborador();
		
		//Entradas
		objetoCliente.setNome(JOptionPane.showInputDialog("Digite o nome do cliente"));
		objetoCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade")));
	
		//Endereco
		objetoEndereco.setLogradouro(JOptionPane.showInputDialog("Digite o endereco"));
		objetoEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero")));
		objetoEndereco.setCep(JOptionPane.showInputDialog("CEP"));
		
		objetoCliente.setEndereco(objetoEndereco);
		
		//Colaborador
		objetoColaborador.setNome(JOptionPane.showInputDialog("Digite o nome do colaborador"));
		objetoColaborador.setCargo(JOptionPane.showInputDialog("Digite o cargo do colaborador"));
		objetoColaborador.setValorHora(Double.parseDouble(JOptionPane.showInputDialog("Digite valor hora do colaborador")));
		objetoColaborador.setQuantidadeHora(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de hora do colaborador")));
		
		
	//Saidas
		System.out.println("Nome do cliente: " + objetoCliente.getNome() +
				"\nIdade: " + objetoCliente.getIdade()+
				"\nLogradouro: " + objetoCliente.getEndereco().getLogradouro()+
				"\nCEP: " +objetoCliente.getEndereco().getCep() +
				"\nNumero: " +objetoCliente.getEndereco().getNumero() +
				"\n\nInformações do colaborador" +
				objetoColaborador.getTudo() +
				"\nSalario: " + objetoColaborador.calcularSalario());
		
		System.out.println("\n\nInformações de taxa\n" +
		objetoColaborador.pagarTaxa());

	}
	
	
	}

