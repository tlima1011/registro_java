package br.com.uam_java.entities;

import java.util.ArrayList;

public class Cliente {
	
	private String nome, endereco;
    private int dia, mes, ano;
	
    public Cliente() { 
    	
    }
    
    public Cliente(String nome, String endereco, int dia, int mes, int ano) {
		this.nome = nome;
		this.endereco = endereco;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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
    
	public static void  menu(){
	    System.out.print("\n=================================\n");
	    System.out.print("\tCADASTRO DE PESSOAS\n");
	    System.out.print("=================================\n");
	    System.out.print("[ 1 ] - Inserir registro: ");
	    System.out.print("\n[ 2 ] - Exibir Lista");
	    System.out.print("\n[ 3 ] - Buscar registro:");
	    System.out.print("\n[ 4 ] - Eliminar registro");
	    System.out.print("\n[ 5 ] - Sair");
	    System.out.print("\n=================================\n");
	    System.out.print("Informe a opcao: ");
	}
	
	public static void exibirLista(ArrayList<Cliente> clientes, int qtdePessoas) { 
		if(clientes.isEmpty()) {
			System.out.println("Lista está vazia");
		}else {
			for (Cliente cliente : clientes) {
				System.out.printf("Nome: %s\tEndereço %s\tData de Nascimento: %d/%d/%d\n", cliente.nome, cliente.endereco,cliente.dia, cliente.mes, cliente.ano);// + "Endereço: " +cliente.endereco + ""); 
			}
		}
	}

	public static void buscarRegistro(ArrayList<Cliente> clientes, String procurarNome, int qtdePessoas) { 
		if(clientes.isEmpty()) {
			System.out.println("Lista está vazia");
		}else if (qtdePessoas >= 0 && qtdePessoas < 10) { 
			for(int i = 0; i < clientes.size();i++) {
				if(clientes.get(i).nome.equalsIgnoreCase(procurarNome)) {
					System.out.printf("Nome: %s\tEndereço %s\tData de Nascimento: %d/%d/%d\n", clientes.get(i).nome, clientes.get(i).endereco, clientes.get(i).dia, clientes.get(i).mes, clientes.get(i).ano);// + "Endereço: " +cliente.endereco + "");
				}
			}
		}else {
			System.out.println("Cliente não encontrado\n");
		}
	}
	
	public static void eliminarRegistro(ArrayList<Cliente> clientes, String procurarNome, int qtdePessoas) {
		if(clientes.isEmpty()) { 
			System.out.println("Lista está vazia");
		}else if(qtdePessoas >= 0 && qtdePessoas < 10) { 
			for(int i = 0; i < clientes.size(); i++) { 
				if(clientes.get(i).nome.equalsIgnoreCase(procurarNome)) {
					clientes.remove(i); 
				}
			}
		}else {
			System.out.println("Cliente não encontrado\n");
		}
	}
}
