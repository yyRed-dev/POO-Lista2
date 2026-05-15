package Questao_16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		Biblioteca biblioteca = new Biblioteca();

		int opcao = -1;

		try {

			System.out.println("--------------------------------------------");
			System.out.println("Bem vindo à Biblioteca!");

			while (opcao != 0) {

				System.out.println("\n---------------- MENU ----------------");
				System.out.println("1 - Adicionar livro.");
				System.out.println("2 - Remover livro.");
				System.out.println("3 - Buscar livro.");
				System.out.println("4 - Verificar livro.");
				System.out.println("5 - Mostrar livros.");
				System.out.println("0 - Finalizar programa.");
				System.out.print("Escolha: ");

				opcao = sc.nextInt();
				sc.nextLine();

				switch (opcao) {

					case 1:

						System.out.print("ISBN: ");
						String isbnAdd = sc.nextLine();

						System.out.print("Título: ");
						String titulo = sc.nextLine();

						biblioteca.adicionarLivro(isbnAdd, titulo);

						System.out.println("Livro adicionado com sucesso!");
						break;

					case 2:

						System.out.print("ISBN do livro: ");
						String isbnRemove = sc.nextLine();

						biblioteca.removerLivro(isbnRemove);

						System.out.println("Livro removido com sucesso!");
						break;

					case 3:

						System.out.print("ISBN do livro: ");
						String isbnBusca = sc.nextLine();

						String livro = biblioteca.buscarLivro(isbnBusca);

						System.out.println("Livro encontrado: " + livro);
						break;

					case 4:

						System.out.print("ISBN do livro: ");
						String isbnVerifica = sc.nextLine();

						if (biblioteca.verificarLivro(isbnVerifica)) {

							System.out.println("O livro existe no sistema.");

						} else {

							System.out.println("Livro não encontrado.");
						}

						break;

					case 5:

						biblioteca.mostrarLivros();
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