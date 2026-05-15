package Questao_11;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		ArrayList<Animal> animais = new ArrayList<Animal>();

		int opcao = -1;

		try {

			System.out.println("--------------------------------------------");
			System.out.println("Bem vindo ao Zoológico!");

			while (opcao != 0) {

				System.out.println("\n---------------- MENU ----------------");
				System.out.println("1 - Cadastrar cachorro.");
				System.out.println("2 - Cadastrar gato.");
				System.out.println("3 - Mostrar animais.");
				System.out.println("4 - Emitir sons.");
				System.out.println("0 - Finalizar programa.");
				System.out.print("Escolha: ");

				opcao = sc.nextInt();
				sc.nextLine();

				switch (opcao) {

					case 1:

						System.out.print("Nome: ");
						String nomeCachorro = sc.nextLine();

						System.out.print("Idade: ");
						int idadeCachorro = sc.nextInt();

						Cachorro cachorro = new Cachorro(nomeCachorro, idadeCachorro);

						animais.add(cachorro);

						System.out.println("Cachorro cadastrado com sucesso!");
						break;

					case 2:

						System.out.print("Nome: ");
						String nomeGato = sc.nextLine();

						System.out.print("Idade: ");
						int idadeGato = sc.nextInt();

						Gato gato = new Gato(nomeGato, idadeGato);

						animais.add(gato);

						System.out.println("Gato cadastrado com sucesso!");
						break;

					case 3:

						if (animais.isEmpty()) {

							System.out.println("Nenhum animal cadastrado.");

						} else {

							System.out.println("\nLista de Animais:");

							for (int i=0; i<animais.size(); i++) {
								System.out.println((i + 1) + " - " + animais.get(i));
							}
						}

						break;

					case 4:

						if (animais.isEmpty()) {

							System.out.println("Nenhum animal cadastrado.");

						} else {

							System.out.println("\nSons dos Animais:");

							for (int i=0; i<animais.size(); i++) {

								Animal animal = animais.get(i);

								System.out.println(animal.getNome() + " -> " + animal.emitirSom());
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