package Questao_03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		int opcao = -1;

		try {

			System.out.println("--------------------------------------------");
			System.out.println("Bem vindo ao Sistema de Retas!");

			Linha linha1 = null;
			Linha linha2 = null;

			while (opcao != 0) {

				System.out.println("\n---------------- MENU ----------------");
				System.out.println("1 - Criar retas.");
				System.out.println("2 - Mostrar retas.");
				System.out.println("3 - Verificar interseção.");
				System.out.println("4 - Verificar se um ponto pertence à reta 1.");
				System.out.println("0 - Finalizar programa.");
				System.out.print("Escolha: ");

				opcao = sc.nextInt();

				switch (opcao) {

					case 1:

						System.out.println("\nCriação da reta 1.");

						System.out.print("Coeficiente Angular: ");
						double a1 = sc.nextDouble();

						System.out.print("Coeficiente Linear: ");
						double b1 = sc.nextDouble();

						linha1 = new Linha(a1, b1);

						System.out.println("\nCriação da reta 2.");

						System.out.print("Coeficiente Angular: ");
						double a2 = sc.nextDouble();

						System.out.print("Coeficiente Linear: ");
						double b2 = sc.nextDouble();

						linha2 = new Linha(a2, b2);

						System.out.println("Retas criadas com sucesso!");
						break;

					case 2:

						if (linha1 == null || linha2 == null) {

							System.out.println("Crie as retas primeiro.");

						} else {

							System.out.println("Reta 1: " + linha1);
							System.out.println("Reta 2: " + linha2);
						}

						break;

					case 3:

						if (linha1 == null || linha2 == null) {

							System.out.println("Crie as retas primeiro.");

						} else {

							Ponto2D intersecao =
								linha1.intersecao(linha2);

							if (intersecao == null) {

								System.out.println("As retas são paralelas.");

							} else {

								System.out.println(
									"Ponto de interseção: " +
									intersecao
								);
							}
						}

						break;

					case 4:

						if (linha1 == null) {

							System.out.println("Crie as retas primeiro.");

						} else {

							System.out.print("Digite o valor de X: ");
							double x = sc.nextDouble();

							System.out.print("Digite o valor de Y: ");
							double y = sc.nextDouble();

							Ponto2D ponto = new Ponto2D(x, y);

							if (linha1.pertence(ponto)) {

								System.out.println("O ponto pertence à reta.");

							} else {

								System.out.println("O ponto não pertence à reta.");
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