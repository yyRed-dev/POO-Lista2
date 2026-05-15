package Questao_04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		int opcao = -1;

		Circulo circulo = null;

		try {

			System.out.println("--------------------------------------------");
			System.out.println("Bem vindo ao Sistema de Círculos!");

			while (opcao != 0) {

				System.out.println("\n---------------- MENU ----------------");
				System.out.println("1 - Criar círculo.");
				System.out.println("2 - Mostrar informações do círculo.");
				System.out.println("3 - Inflar círculo.");
				System.out.println("4 - Desinflar círculo.");
				System.out.println("5 - Calcular área.");
				System.out.println("0 - Finalizar programa.");
				System.out.print("Escolha: ");

				opcao = sc.nextInt();

				switch (opcao) {

					case 1:

						System.out.println("\nComo deseja criar o círculo?");
						System.out.println("1 - Apenas raio.");
						System.out.println("2 - Raio e centro.");
						System.out.print("Escolha: ");

						int subOpcao = sc.nextInt();

						switch (subOpcao) {

							case 1:

								System.out.print("Digite o valor do raio: ");
								double raio = sc.nextDouble();

								circulo = new Circulo(raio);

								System.out.println("Círculo criado com sucesso!");
								break;

							case 2:

								System.out.print("Digite o valor do raio: ");
								raio = sc.nextDouble();

								System.out.print("Digite o valor de X: ");
								double x = sc.nextDouble();

								System.out.print("Digite o valor de Y: ");
								double y = sc.nextDouble();

								Ponto2D centro = new Ponto2D(x, y);

								circulo = new Circulo(raio, centro);

								System.out.println("Círculo criado com sucesso!");
								break;

							default:

								System.out.println("Digite apenas opções válidas.");
								break;
						}

						break;

					case 2:

						if (circulo == null) {

							System.out.println("Crie um círculo primeiro.");

						} else {

							System.out.println(circulo);
						}

						break;

					case 3:

						if (circulo == null) {

							System.out.println("Crie um círculo primeiro.");

						} else {

							System.out.print("Quanto deseja aumentar no raio? ");
							double valor = sc.nextDouble();

							circulo.inflar(valor);

							System.out.println("Círculo inflado com sucesso!");
						}

						break;

					case 4:

						if (circulo == null) {

							System.out.println("Crie um círculo primeiro.");

						} else {

							System.out.print("Quanto deseja reduzir do raio? ");
							double valor = sc.nextDouble();

							circulo.desinflar(valor);

							System.out.println("Círculo desinflado com sucesso!");
						}

						break;

					case 5:

						if (circulo == null) {

							System.out.println("Crie um círculo primeiro.");

						} else {

							System.out.printf(
								"Área do círculo: %.2f\n",
								circulo.calcularArea()
							);
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