package Questao_09;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

		int opcao = -1;

		try {

			System.out.println("--------------------------------------------");
			System.out.println("Bem vindo à Locadora!");

			while (opcao != 0) {

				System.out.println("\n---------------- MENU ----------------");
				System.out.println("1 - Cadastrar carro.");
				System.out.println("2 - Cadastrar moto.");
				System.out.println("3 - Mostrar veículos.");
				System.out.println("0 - Finalizar programa.");
				System.out.print("Escolha: ");

				opcao = sc.nextInt();
				sc.nextLine();

				switch (opcao) {

					case 1:

						System.out.print("Marca: ");
						String marcaCarro = sc.nextLine();

						System.out.print("Modelo: ");
						String modeloCarro = sc.nextLine();

						System.out.print("Quantidade de portas: ");
						int portas = sc.nextInt();

						Carro carro = new Carro(marcaCarro, modeloCarro, portas);

						veiculos.add(carro);

						System.out.println("Carro cadastrado com sucesso!");
						break;

					case 2:

						System.out.print("Marca: ");
						String marcaMoto = sc.nextLine();

						System.out.print("Modelo: ");
						String modeloMoto = sc.nextLine();

						System.out.print("Cilindradas: ");
						int cilindradas = sc.nextInt();

						Moto moto = new Moto(marcaMoto, modeloMoto, cilindradas);

						veiculos.add(moto);

						System.out.println("Moto cadastrada com sucesso!");
						break;

					case 3:

						if (veiculos.isEmpty()) {

							System.out.println("Nenhum veículo cadastrado.");

						} else {

							System.out.println("\nLista de Veículos:");

							for (int i=0; i<veiculos.size(); i++) {
								System.out.println((i + 1) + " - " + veiculos.get(i));
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