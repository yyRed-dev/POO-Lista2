package Questao_14;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		ArrayList<Dispositivo> dispositivos = new ArrayList<Dispositivo>();

		int opcao = -1;

		try {

			System.out.println("--------------------------------------------");
			System.out.println("Bem vindo ao Sistema de Dispositivos!");

			while (opcao != 0) {

				System.out.println("\n---------------- MENU ----------------");
				System.out.println("1 - Cadastrar computador.");
				System.out.println("2 - Cadastrar televisão.");
				System.out.println("3 - Ligar dispositivo.");
				System.out.println("4 - Desligar dispositivo.");
				System.out.println("5 - Mostrar dispositivos.");
				System.out.println("0 - Finalizar programa.");
				System.out.print("Escolha: ");

				opcao = sc.nextInt();
				sc.nextLine();

				switch (opcao) {

					case 1:

						System.out.print("Nome do computador: ");
						String nomePC = sc.nextLine();

						Computador pc = new Computador(nomePC);

						dispositivos.add(pc);

						System.out.println("Computador cadastrado com sucesso!");
						break;

					case 2:

						System.out.print("Nome da televisão: ");
						String nomeTV = sc.nextLine();

						Televisao tv = new Televisao(nomeTV);

						dispositivos.add(tv);

						System.out.println("Televisão cadastrada com sucesso!");
						break;

					case 3:

						if (dispositivos.isEmpty()) {

							System.out.println("Nenhum dispositivo cadastrado.");

						} else {

							System.out.println("\nSelecione um dispositivo:");

							for (int i=0; i<dispositivos.size(); i++) {
								System.out.println((i + 1) + " - " + dispositivos.get(i));
							}

							int ligar = sc.nextInt() - 1;

							Ligavel dispositivo = (Ligavel) dispositivos.get(ligar);

							dispositivo.ligar();
						}

						break;

					case 4:

						if (dispositivos.isEmpty()) {

							System.out.println("Nenhum dispositivo cadastrado.");

						} else {

							System.out.println("\nSelecione um dispositivo:");

							for (int i=0; i<dispositivos.size(); i++) {
								System.out.println((i + 1) + " - " + dispositivos.get(i));
							}

							int desligar = sc.nextInt() - 1;

							Ligavel dispositivo = (Ligavel) dispositivos.get(desligar);

							dispositivo.desligar();
						}

						break;

					case 5:

						if (dispositivos.isEmpty()) {

							System.out.println("Nenhum dispositivo cadastrado.");

						} else {

							System.out.println("\nLista de Dispositivos:");

							for (int i=0; i<dispositivos.size(); i++) {
								System.out.println((i + 1) + " - " + dispositivos.get(i));
							}
						}

						break;

					case 0:

						System.out.println("Finalizando programa...");
						break;

					default:

						System.out.println("Digite apenas opções válidas.");
						break;
				}
			}
		}

		catch (InputMismatchException erro) {

			System.out.println("Entrada inválida. Por favor, digite apenas números!");
		}

		catch (IllegalArgumentException erro) {

			System.out.println("Erro: " + erro.getMessage());
		}

		catch (Exception erro) {

			System.out.println("Um erro desconhecido ocorreu.");
			System.out.println("Código do erro: " + erro.getMessage());
		}
	}
}