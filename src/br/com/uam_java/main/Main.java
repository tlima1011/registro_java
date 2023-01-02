package br.com.uam_java.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.uam_java.entities.Cliente;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); 
		
		ArrayList<Cliente> clientes = new ArrayList<>(); 
		String nome = "", ender = ""; 
		Character cont; 
		int dia = 0, mes = 0, ano = 0;
		
		int opcao = 0, qtdePessoas = 0; 
		
		while(opcao != 5) { 
			Cliente.menu();
			opcao = ler.nextInt(); 
			switch(opcao) { 
				case 1:
					while(qtdePessoas < 10) {
						ler.nextLine();
						System.out.print("Nome: ");
						nome = ler.nextLine();
						System.out.print("Endereço: ");
						ender = ler.nextLine(); 
						System.out.print("Dia de Nascimento: ");
						dia = ler.nextInt(); 
						System.out.print("Mês de nascimento: ");
						mes = ler.nextInt(); 
						System.out.print("Ano de nascimento: ");
						ano = ler.nextInt();
						ler.nextLine();
						System.out.print("Deseja continuar: S/N: "); 
						cont = ler.nextLine().charAt(0); 
						cont = Character.toUpperCase(cont); 
						if(cont == 'S') {
							qtdePessoas++;
							clientes.add(new Cliente(nome, ender, dia, mes, ano)); 
						}else {
							break; 
						}
					}
					case 2:
						Cliente.exibirLista(clientes);
						
					break;
			}
		}
		
		ler.close();

	}

}
