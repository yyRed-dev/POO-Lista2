package Questao_10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

		int opcao = -1;

		try {

			System.out.println("--------------------------------------------");
			System.out.println("Bem vindo ao Sistema de RH!");

			while (opcao != 0) {

				System.out.println("\n---------------- MENU ----------------");
				System.out.println("1 - Cadastrar gerente.");
				System.out.println("2 - Cadastrar desenvolvedor.");
				System.out.println("3 - Mostrar funcionários.");
				System.out.println("4 - Mostrar bônus.");
				System.out.println("0 - Finalizar programa.");
				System.out.print("Escolha: ");

				opcao = sc.nextInt();
				sc.nextLine();

				switch (opcao) {

					case 1:

						System.out.print("Nome: ");
						String nomeGerente = sc.nextLine();

						System.out.print("Salário: ");
						double salarioGerente = sc.nextDouble();

						Gerente gerente = new Gerente(nomeGerente, salarioGerente);

						funcionarios.add(gerente);

						System.out.println("Gerente cadastrado com sucesso!");
						break;

					case 2:

						System.out.print("Nome: ");
						String nomeDev = sc.nextLine();

						System.out.print("Salário: ");
						double salarioDev = sc.nextDouble();

						Desenvolvedor dev = new Desenvolvedor(nomeDev, salarioDev);

						funcionarios.add(dev);

						System.out.println("Desenvolvedor cadastrado com sucesso!");
						break;

					case 3:

						if (funcionarios.isEmpty()) {

							System.out.println("Nenhum funcionário cadastrado.");

						} else {

							System.out.println("\nLista de Funcionários:");

							for (int i=0; i<funcionarios.size(); i++) {
								System.out.println((i + 1) + " - " + funcionarios.get(i));
							}
						}

						break;

					case 4:

						if (funcionarios.isEmpty()) {

							System.out.println("Nenhum funcionário cadastrado.");

						} else {

							System.out.println("\nLista de Bônus:");

							for (int i=0; i<funcionarios.size(); i++) {

								Funcionario funcionario = funcionarios.get(i);

								System.out.println(funcionario.getNome() + " -> Bonus: R$ " + funcionario.calcularBonus());
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