package Questao_07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		Conjunto conjunto1 =
			new Conjunto();

		Conjunto conjunto2 =
			new Conjunto();

		int opcao = -1;

		try {

			System.out.println("--------------------------------------------");
			System.out.println("Bem vindo ao Sistema de Conjuntos!");

			while (opcao != 0) {

				System.out.println("\n---------------- MENU ----------------");
				System.out.println("1 - Adicionar elemento ao conjunto 1.");
				System.out.println("2 - Adicionar elemento ao conjunto 2.");
				System.out.println("3 - Mostrar conjuntos.");
				System.out.println("4 - União dos conjuntos.");
				System.out.println("5 - Interseção dos conjuntos.");
				System.out.println("6 - Diferença dos conjuntos.");
				System.out.println("7 - Verificar elemento.");
				System.out.println("0 - Finalizar programa.");
				System.out.print("Escolha: ");

				opcao = sc.nextInt();
				sc.nextLine();

				switch (opcao) {

					case 1:

						System.out.print(
							"Digite o elemento: "
						);

						String elemento1 =
							sc.nextLine();

						conjunto1.adicionarElemento(
							elemento1
						);

						System.out.println(
							"Elemento adicionado ao conjunto 1!"
						);

						break;

					case 2:

						System.out.print(
							"Digite o elemento: "
						);

						String elemento2 =
							sc.nextLine();

						conjunto2.adicionarElemento(
							elemento2
						);

						System.out.println(
							"Elemento adicionado ao conjunto 2!"
						);

						break;

					case 3:

						System.out.println(
							"Conjunto 1: " +
							conjunto1
						);

						System.out.println(
							"Conjunto 2: " +
							conjunto2
						);

						break;

					case 4:

						System.out.println(
							"União: " +
							conjunto1.uniao(conjunto2)
						);

						break;

					case 5:

						System.out.println(
							"Interseção: " +
							conjunto1.inter(conjunto2)
						);

						break;

					case 6:

						System.out.println(
							"Diferença: " +
							conjunto1.menos(conjunto2)
						);

						break;

					case 7:

						System.out.print(
							"Digite o elemento: "
						);

						String busca =
							sc.nextLine();

						if (
							conjunto1.pertence(busca) ||
							conjunto2.pertence(busca)
						) {

							System.out.println(
								"O elemento pertence a um dos conjuntos."
							);

						} else {

							System.out.println(
								"Elemento não encontrado."
							);
						}

						break;

					case 0:

						System.out.println(
							"Finalizando programa..."
						);

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