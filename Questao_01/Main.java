package Questao_01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		int opcao = -1;
		int valorInicial;

		try {

			System.out.println("--------------------------------------------");
			System.out.println("Bem vindo ao Contador de pessoas do Evento!");

			System.out.print("\nDefina o valor inicial do contador: ");
			valorInicial = sc.nextInt();

			Contador contador = new Contador(valorInicial);

			while (opcao != 0) {

				System.out.println("\n---------------- MENU ----------------");
				System.out.println("1 - Incrementar contador.");
				System.out.println("2 - Reduzir contador.");
				System.out.println("3 - Mostrar total de pessoas.");
				System.out.println("4 - Zerar contador.");
				System.out.println("0 - Finalizar programa.");
				System.out.print("Escolha: ");

				opcao = sc.nextInt();

				switch (opcao) {

					case 1:

						contador.aumentarContador();

						System.out.println("Contador incrementado com sucesso!");
						break;

					case 2:

						contador.reduzirContador();

						System.out.println("Contador reduzido com sucesso!");
						break;

					case 3:

						System.out.println("Total de pessoas: " + contador.getPessoas());
						break;

					case 4:

						contador.zerarContador();

						System.out.println("Contador zerado com sucesso!");
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