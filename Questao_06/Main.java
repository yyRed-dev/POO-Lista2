package Questao_06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		ArrayList<Pessoa> pessoas =
			new ArrayList<Pessoa>();

		int opcao = -1;

		try {

			System.out.println("--------------------------------------------");
			System.out.println("Bem vindo ao Sistema Genealógico!");

			while (opcao != 0) {

				System.out.println("\n---------------- MENU ----------------");
				System.out.println("1 - Cadastrar pessoa.");
				System.out.println("2 - Mostrar pessoas.");
				System.out.println("3 - Comparar pessoas.");
				System.out.println("0 - Finalizar programa.");
				System.out.print("Escolha: ");

				opcao = sc.nextInt();
				sc.nextLine();

				switch (opcao) {

					case 1:

						System.out.println(
							"\nDeseja cadastrar apenas o nome?"
						);

						System.out.println(
							"1 - Sim | 2 - Não"
						);

						System.out.print("Escolha: ");
						int subOpcao = sc.nextInt();
						sc.nextLine();

						switch (subOpcao) {

							case 1:

								System.out.print("Nome: ");
								String nome =
									sc.nextLine();

								Pessoa pessoa =
									new Pessoa(nome);

								pessoas.add(pessoa);

								System.out.println(
									"Pessoa cadastrada com sucesso!"
								);

								break;

							case 2:

								System.out.print("Nome: ");
								nome = sc.nextLine();

								System.out.print("Nome da mãe: ");
								String mae =
									sc.nextLine();

								System.out.print("Nome do pai: ");
								String pai =
									sc.nextLine();

								pessoa =
									new Pessoa(
										nome,
										mae,
										pai
									);

								pessoas.add(pessoa);

								System.out.println(
									"Pessoa cadastrada com sucesso!"
								);

								break;

							default:

								System.out.println(
									"Digite apenas opções válidas."
								);

								break;
						}

						break;

					case 2:

						if (pessoas.isEmpty()) {

							System.out.println(
								"Nenhuma pessoa cadastrada."
							);

						} else {

							System.out.println(
								"\nLista de Pessoas:"
							);

							for (int i=0; i<pessoas.size(); i++) {

								System.out.println(
									(i + 1) + " - " +
									pessoas.get(i)
								);
							}
						}

						break;

					case 3:

						if (pessoas.size() < 2) {

							System.out.println(
								"Cadastre pelo menos duas pessoas."
							);

						} else {

							System.out.println(
								"\nSelecione a primeira pessoa:"
							);

							for (int i=0; i<pessoas.size(); i++) {

								System.out.println(
									(i + 1) + " - " +
									pessoas.get(i).getNome()
								);
							}

							int pessoa1 =
								sc.nextInt() - 1;

							System.out.println(
								"\nSelecione a segunda pessoa:"
							);

							for (int i=0; i<pessoas.size(); i++) {

								System.out.println(
									(i + 1) + " - " +
									pessoas.get(i).getNome()
								);
							}

							int pessoa2 =
								sc.nextInt() - 1;

							if (
								pessoas.get(pessoa1)
									.equals(
										pessoas.get(pessoa2)
									)
							) {

								System.out.println(
									"As pessoas são semanticamente iguais."
								);

							} else {

								System.out.println(
									"As pessoas são diferentes."
								);
							}
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