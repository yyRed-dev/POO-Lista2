package Questao_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		int opcao = -1;

		try {

			System.out.println("--------------------------------------------");
			System.out.println("Bem vindo ao Sistema de Pontos 2D!");

			System.out.println("\nCriação do Ponto 1.");
			System.out.print("Digite o valor de X: ");
			double x1 = sc.nextDouble();

			System.out.print("Digite o valor de Y: ");
			double y1 = sc.nextDouble();

			Ponto2D ponto1 = new Ponto2D(x1, y1);

			System.out.println("\nCriação do Ponto 2.");
			System.out.print("Digite o valor de X: ");
			double x2 = sc.nextDouble();

			System.out.print("Digite o valor de Y: ");
			double y2 = sc.nextDouble();

			Ponto2D ponto2 = new Ponto2D(x2, y2);

			while (opcao != 0) {

				System.out.println("\n---------------- MENU ----------------");
				System.out.println("1 - Mostrar pontos.");
				System.out.println("2 - Comparar pontos.");
				System.out.println("3 - Calcular distância.");
				System.out.println("4 - Alterar coordenadas do ponto 1.");
				System.out.println("5 - Alterar coordenadas do ponto 2.");
				System.out.println("0 - Finalizar programa.");
				System.out.print("Escolha: ");

				opcao = sc.nextInt();

				switch (opcao) {

					case 1:

						System.out.println("Ponto 1: " + ponto1);
						System.out.println("Ponto 2: " + ponto2);
						break;

					case 2:

						if (ponto1.equals(ponto2)) {

							System.out.println("Os pontos são iguais.");

						} else {

							System.out.println("Os pontos são diferentes.");
						}

						break;

					case 3:

						System.out.printf(
							"Distância entre os pontos: %.2f\n",
							ponto1.calcularDistancia(ponto2)
						);

						break;

					case 4:

						System.out.print("Novo valor de X: ");
						ponto1.setX(sc.nextDouble());

						System.out.print("Novo valor de Y: ");
						ponto1.setY(sc.nextDouble());

						System.out.println("Ponto 1 atualizado com sucesso!");
						break;

					case 5:

						System.out.print("Novo valor de X: ");
						ponto2.setX(sc.nextDouble());

						System.out.print("Novo valor de Y: ");
						ponto2.setY(sc.nextDouble());

						System.out.println("Ponto 2 atualizado com sucesso!");
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

		catch (Exception erro) {

			System.out.println("Um erro desconhecido ocorreu.");
			System.out.println("Código do erro: " + erro.getMessage());
		}
	}
}