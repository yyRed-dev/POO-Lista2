package Questao_13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		Boletim boletim = new Boletim();

		int opcao = -1;

		try {

			System.out.println("--------------------------------------------");
			System.out.println("Bem vindo ao Sistema Escolar!");

			while (opcao != 0) {

				System.out.println("\n---------------- MENU ----------------");
				System.out.println("1 - Adicionar nota.");
				System.out.println("2 - Mostrar notas.");
				System.out.println("3 - Calcular média.");
				System.out.println("4 - Mostrar maior nota.");
				System.out.println("5 - Mostrar menor nota.");
				System.out.println("0 - Finalizar programa.");
				System.out.print("Escolha: ");

				opcao = sc.nextInt();

				switch (opcao) {

					case 1:

						System.out.print("Digite a nota: ");
						double nota = sc.nextDouble();

						boletim.adicionarNota(nota);

						System.out.println("Nota adicionada com sucesso!");
						break;

					case 2:

						boletim.mostrarNotas();
						break;

					case 3:

						System.out.println("Média: " + boletim.calcularMedia());
						break;

					case 4:

						System.out.println("Maior nota: " + boletim.maiorNota());
						break;

					case 5:

						System.out.println("Menor nota: " + boletim.menorNota());
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