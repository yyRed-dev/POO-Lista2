package Questao_15;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		ArrayList<Forma> formas = new ArrayList<Forma>();

		int opcao = -1;

		try {

			System.out.println("--------------------------------------------");
			System.out.println("Bem vindo ao Sistema de Formas!");

			while (opcao != 0) {

				System.out.println("\n---------------- MENU ----------------");
				System.out.println("1 - Criar retângulo.");
				System.out.println("2 - Criar círculo.");
				System.out.println("3 - Mostrar formas.");
				System.out.println("4 - Calcular áreas.");
				System.out.println("5 - Calcular perímetros.");
				System.out.println("0 - Finalizar programa.");
				System.out.print("Escolha: ");

				opcao = sc.nextInt();

				switch (opcao) {

					case 1:

						System.out.print("Largura: ");
						double largura = sc.nextDouble();

						System.out.print("Altura: ");
						double altura = sc.nextDouble();

						Retangulo retangulo = new Retangulo(largura, altura);

						formas.add(retangulo);

						System.out.println("Retângulo criado com sucesso!");
						break;

					case 2:

						System.out.print("Raio: ");
						double raio = sc.nextDouble();

						Circulo circulo = new Circulo(raio);

						formas.add(circulo);

						System.out.println("Círculo criado com sucesso!");
						break;

					case 3:

						if (formas.isEmpty()) {

							System.out.println("Nenhuma forma cadastrada.");

						} else {

							System.out.println("\nLista de Formas:");

							for (int i=0; i<formas.size(); i++) {
								System.out.println((i + 1) + " - " + formas.get(i));
							}
						}

						break;

					case 4:

						if (formas.isEmpty()) {

							System.out.println("Nenhuma forma cadastrada.");

						} else {

							System.out.println("\nÁreas:");

							for (int i=0; i<formas.size(); i++) {

								Forma forma = formas.get(i);

								System.out.println((i + 1) + " -> " + forma.calcularArea());
							}
						}

						break;

					case 5:

						if (formas.isEmpty()) {

							System.out.println("Nenhuma forma cadastrada.");

						} else {

							System.out.println("\nPerímetros:");

							for (int i=0; i<formas.size(); i++) {

								Forma forma = formas.get(i);

								System.out.println((i + 1) + " -> " + forma.calcularPerimetro());
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