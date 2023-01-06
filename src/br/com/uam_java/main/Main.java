package br.com.uam_java.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.uam_java.entities.Cliente;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		ArrayList<Cliente> clientes = new ArrayList<>();

		String nome = "", ender = "", procurarNome = "";
		Character cont = '\u0000';

		int dia = 0, mes = 0, ano = 0;

		int opcao = 0, qtdePessoas = 0;

		while (opcao != 5) {
			Cliente.menu();
			opcao = ler.nextInt();
			switch (opcao) {
			case 1:
				ler.nextLine();
				while (qtdePessoas < 10) {
					System.out.print("Nome: ");
					nome = ler.nextLine();
					nome = nome.toUpperCase();
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
					qtdePessoas++;
					clientes.add(new Cliente(nome, ender, dia, mes, ano));
					if (cont == 'N') {
						break;
					}
					if(qtdePessoas >= 10) {
						System.out.println("Não permitido mais de 10 pessoas\n");
					}
				}
				break;
			case 2:
				Cliente.exibirLista(clientes);
				break;
			case 3:
				ler.nextLine();
				System.out.print("Informe o nome para procurar: ");
				procurarNome = ler.nextLine();
				procurarNome = procurarNome.toUpperCase();
				Cliente.buscarRegistro(clientes, procurarNome,qtdePessoas);
				break;
			case 4:
				ler.nextLine();
				System.out.print("Informe o nome para eliminar: ");
				procurarNome = ler.nextLine();
				procurarNome = procurarNome.toUpperCase();
				Cliente.eliminarRegistro(clientes, procurarNome,qtdePessoas);
				break;
			}
		}
		ler.close();
	}
}
