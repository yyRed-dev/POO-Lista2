package Questao_12;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();

		int opcao = -1;

		try {

			System.out.println("--------------------------------------------");
			System.out.println("Bem vindo ao Banco Digital!");

			while (opcao != 0) {

				System.out.println("\n---------------- MENU ----------------");
				System.out.println("1 - Criar conta corrente.");
				System.out.println("2 - Criar conta poupança.");
				System.out.println("3 - Depositar.");
				System.out.println("4 - Sacar.");
				System.out.println("5 - Render juros.");
				System.out.println("6 - Mostrar contas.");
				System.out.println("0 - Finalizar programa.");
				System.out.print("Escolha: ");

				opcao = sc.nextInt();

				switch (opcao) {

					case 1:

						System.out.print("Número da conta: ");
						int numeroCC = sc.nextInt();

						System.out.print("Saldo inicial: ");
						double saldoCC = sc.nextDouble();

						ContaCorrente cc = new ContaCorrente(numeroCC, saldoCC);

						contas.add(cc);

						System.out.println("Conta corrente criada com sucesso!");
						break;

					case 2:

						System.out.print("Número da conta: ");
						int numeroCP = sc.nextInt();

						System.out.print("Saldo inicial: ");
						double saldoCP = sc.nextDouble();

						ContaPoupanca cp = new ContaPoupanca(numeroCP, saldoCP);

						contas.add(cp);

						System.out.println("Conta poupança criada com sucesso!");
						break;

					case 3:

						if (contas.isEmpty()) {

							System.out.println("Nenhuma conta cadastrada.");

						} else {

							System.out.println("\nSelecione a conta:");

							for (int i=0; i<contas.size(); i++) {
								System.out.println((i + 1) + " - " + contas.get(i));
							}

							int contaDeposito = sc.nextInt() - 1;

							System.out.print("Valor do depósito: ");
							double deposito = sc.nextDouble();

							contas.get(contaDeposito).depositar(deposito);

							System.out.println("Depósito realizado com sucesso!");
						}

						break;

					case 4:

						if (contas.isEmpty()) {

							System.out.println("Nenhuma conta cadastrada.");

						} else {

							System.out.println("\nSelecione a conta:");

							for (int i=0; i<contas.size(); i++) {
								System.out.println((i + 1) + " - " + contas.get(i));
							}

							int contaSaque = sc.nextInt() - 1;

							System.out.print("Valor do saque: ");
							double saque = sc.nextDouble();

							contas.get(contaSaque).sacar(saque);

							System.out.println("Saque realizado com sucesso!");
						}

						break;

					case 5:

						if (contas.isEmpty()) {

							System.out.println("Nenhuma conta cadastrada.");

						} else {

							System.out.println("\nSelecione a conta poupança:");

							for (int i=0; i<contas.size(); i++) {

								if (contas.get(i) instanceof ContaPoupanca) {
									System.out.println((i + 1) + " - " + contas.get(i));
								}
							}

							int contaJuros = sc.nextInt() - 1;

							if (contas.get(contaJuros) instanceof ContaPoupanca) {

								System.out.print("Taxa de juros (%): ");
								double taxa = sc.nextDouble();

								ContaPoupanca poupanca = (ContaPoupanca) contas.get(contaJuros);

								poupanca.renderJuros(taxa);

								System.out.println("Juros aplicados com sucesso!");

							} else {

								System.out.println("A conta selecionada não é uma conta poupança.");
							}
						}

						break;

					case 6:

						if (contas.isEmpty()) {

							System.out.println("Nenhuma conta cadastrada.");

						} else {

							System.out.println("\nLista de Contas:");

							for (int i=0; i<contas.size(); i++) {
								System.out.println((i + 1) + " - " + contas.get(i));
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