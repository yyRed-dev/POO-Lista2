package Questao_05;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		ArrayList<Pais> paises =
			new ArrayList<Pais>();

		int opcao = -1;

		try {

			System.out.println("--------------------------------------------");
			System.out.println("Bem vindo ao Sistema de Países!");

			while (opcao != 0) {

				System.out.println("\n---------------- MENU ----------------");
				System.out.println("1 - Cadastrar país.");
				System.out.println("2 - Mostrar países.");
				System.out.println("3 - Adicionar país vizinho.");
				System.out.println("4 - Mostrar densidade populacional.");
				System.out.println("0 - Finalizar programa.");
				System.out.print("Escolha: ");

				opcao = sc.nextInt();
				sc.nextLine();

				switch (opcao) {

					case 1:

						System.out.print("Código ISO: ");
						String iso = sc.nextLine();

						System.out.print("Nome do país: ");
						String nome = sc.nextLine();

						System.out.print("População: ");
						long populacao = sc.nextLong();

						System.out.print("Dimensão territorial: ");
						double dimensao = sc.nextDouble();

						Pais novoPais =
							new Pais(
								iso,
								nome,
								populacao,
								dimensao
							);

						if (paises.contains(novoPais)) {

							System.out.println("Já existe um país com esse ISO.");

						} else {

							paises.add(novoPais);

							System.out.println("País cadastrado com sucesso!");
						}

						break;

					case 2:

						if (paises.isEmpty()) {

							System.out.println("Nenhum país cadastrado.");

						} else {

							System.out.println("\nLista de Países:");

							for (int i=0; i<paises.size(); i++) {

								System.out.println(
									(i + 1) + " - " +
									paises.get(i)
								);
							}
						}

						break;

					case 3:

						if (paises.size() < 2) {

							System.out.println(
								"É necessário possuir pelo menos dois países cadastrados."
							);

						} else {

							System.out.println("\nSelecione o país principal:");

							for (int i=0; i<paises.size(); i++) {

								System.out.println(
									(i + 1) + " - " +
									paises.get(i).getNome()
								);
							}

							int pais1 = sc.nextInt() - 1;

							System.out.println("\nSelecione o país vizinho:");

							for (int i=0; i<paises.size(); i++) {

								System.out.println(
									(i + 1) + " - " +
									paises.get(i).getNome()
								);
							}

							int pais2 = sc.nextInt() - 1;

							if (pais1 == pais2) {

								System.out.println(
									"Um país não pode ser vizinho dele mesmo."
								);

							} else {

								paises.get(pais1)
									.adicionarVizinho(
										paises.get(pais2)
									);

								System.out.println(
									"País vizinho adicionado com sucesso!"
								);
							}
						}

						break;

					case 4:

						if (paises.isEmpty()) {

							System.out.println("Nenhum país cadastrado.");

						} else {

							System.out.println("\nDensidade Populacional:");

							for (int i=0; i<paises.size(); i++) {

								System.out.printf(
									"%s -> %.2f hab/km²\n",
									paises.get(i).getNome(),
									paises.get(i).calcularDensidade()
								);
							}
						}

						break;

					case 0:

						System.out.println("Finalizando programa...");
						break;

					default:

						System.out.println(
							"Digite apenas opções válidas."
						);
						break;
				}
			}
		}

		catch (InputMismatchException erro) {

			System.out.println(
				"Entrada inválida. Por favor, digite apenas números!"
			);
		}

		catch (IllegalArgumentException erro) {

			System.out.println(
				"Erro: " + erro.getMessage()
			);
		}

		catch (Exception erro) {

			System.out.println(
				"Um erro desconhecido ocorreu."
			);

			System.out.println(
				"Código do erro: " + erro.getMessage()
			);
		}
	}
}