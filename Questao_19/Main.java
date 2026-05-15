package Questao_19;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		ArrayList<Operacao> operacoes = new ArrayList<Operacao>();

		operacoes.add(new Soma());
		operacoes.add(new Subtracao());
		operacoes.add(new Multiplicacao());
		operacoes.add(new Divisao());

		int opcao = -1;

		try {

			System.out.println("--------------------------------------------");
			System.out.println("Bem vindo à Calculadora!");

			while (opcao != 0) {

				System.out.println("\n---------------- MENU ----------------");
				System.out.println("1 - Soma.");
				System.out.println("2 - Subtração.");
				System.out.println("3 - Multiplicação.");
				System.out.println("4 - Divisão.");
				System.out.println("0 - Finalizar programa.");
				System.out.print("Escolha: ");

				opcao = sc.nextInt();

				switch (opcao) {

					case 1:
					case 2:
					case 3:
					case 4:

						System.out.print("Primeiro valor: ");
						double a = sc.nextDouble();

						System.out.print("Segundo valor: ");
						double b = sc.nextDouble();

						Operacao operacao = operacoes.get(opcao - 1);

						double resultado = operacao.calcular(a, b);

						System.out.println("\nOperação: " + operacao);
						System.out.println("Resultado: " + resultado);

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