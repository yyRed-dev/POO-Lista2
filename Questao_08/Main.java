package Questao_08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		Matriz matriz1 = null;
		Matriz matriz2 = null;

		int opcao = -1;

		try {

			System.out.println("--------------------------------------------");
			System.out.println("Bem vindo ao Sistema de Matrizes!");

			while (opcao != 0) {

				System.out.println("\n---------------- MENU ----------------");
				System.out.println("1 - Criar matrizes.");
				System.out.println("2 - Mostrar matrizes.");
				System.out.println("3 - Somar matrizes.");
				System.out.println("4 - Subtrair matrizes.");
				System.out.println("5 - Multiplicar matrizes.");
				System.out.println("6 - Mostrar transposta da matriz 1.");
				System.out.println("7 - Verificar propriedades.");
				System.out.println("0 - Finalizar programa.");
				System.out.print("Escolha: ");

				opcao = sc.nextInt();

				switch (opcao) {

					case 1:

						System.out.print("Quantidade de linhas: ");
						int linhas = sc.nextInt();

						System.out.print("Quantidade de colunas: ");
						int colunas = sc.nextInt();

						matriz1 = new Matriz(linhas, colunas);
						matriz2 = new Matriz(linhas, colunas);

						System.out.println("\nPreencha a matriz 1:");
						preencherMatriz(matriz1);

						System.out.println("\nPreencha a matriz 2:");
						preencherMatriz(matriz2);

						System.out.println("Matrizes criadas com sucesso!");
						break;

					case 2:

						if (matriz1 == null || matriz2 == null) {

							System.out.println("Crie as matrizes primeiro.");

						} else {

							System.out.println("\nMatriz 1:");
							System.out.println(matriz1);

							System.out.println("\nMatriz 2:");
							System.out.println(matriz2);
						}

						break;

					case 3:

						System.out.println("\nResultado:");
						System.out.println(matriz1.somar(matriz2));
						break;

					case 4:

						System.out.println("\nResultado:");
						System.out.println(matriz1.subtrair(matriz2));
						break;

					case 5:

						System.out.println("\nResultado:");
						System.out.println(matriz1.multiplicar(matriz2));
						break;

					case 6:

						System.out.println("\nTransposta:");
						System.out.println(matriz1.transposta());
						break;

					case 7:

						System.out.println("\nMatriz 1:");

						System.out.println("É identidade? " + matriz1.isIdentidade());
						System.out.println("É diagonal? " + matriz1.isDiagonal());
						System.out.println("É nula? " + matriz1.isNula());
						System.out.println("É simétrica? " + matriz1.isSimetrica());
						System.out.println("É anti-simétrica? " + matriz1.isAntiSimetrica());
						System.out.println("É singular? " + matriz1.isSingular());

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

	// preencher matriz
	public static void preencherMatriz(Matriz matriz) {

		for (int i=0; i<matriz.getLinhas(); i++) {

			for (int j=0; j<matriz.getColunas(); j++) {

				System.out.print("Elemento [" + i + "][" + j + "]: ");

				double valor = sc.nextDouble();

				matriz.setElemento(i, j, valor);
			}
		}
	}
}