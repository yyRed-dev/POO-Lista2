package Questao_18;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

		int opcao = -1;

		try {

			System.out.println("--------------------------------------------");
			System.out.println("Bem vindo ao Sistema Escolar!");

			while (opcao != 0) {

				System.out.println("\n---------------- MENU ----------------");
				System.out.println("1 - Cadastrar aluno.");
				System.out.println("2 - Cadastrar professor.");
				System.out.println("3 - Mostrar usuários.");
				System.out.println("4 - Fazer login.");
				System.out.println("0 - Finalizar programa.");
				System.out.print("Escolha: ");

				opcao = sc.nextInt();
				sc.nextLine();

				switch (opcao) {

					case 1:

						System.out.print("Nome: ");
						String nomeAluno = sc.nextLine();

						System.out.print("Idade: ");
						int idadeAluno = sc.nextInt();

						Aluno aluno = new Aluno(nomeAluno, idadeAluno);

						usuarios.add(aluno);

						System.out.println("Aluno cadastrado com sucesso!");
						break;

					case 2:

						System.out.print("Nome: ");
						String nomeProfessor = sc.nextLine();

						System.out.print("Idade: ");
						int idadeProfessor = sc.nextInt();

						Professor professor = new Professor(nomeProfessor, idadeProfessor);

						usuarios.add(professor);

						System.out.println("Professor cadastrado com sucesso!");
						break;

					case 3:

						if (usuarios.isEmpty()) {

							System.out.println("Nenhum usuário cadastrado.");

						} else {

							System.out.println("\nLista de Usuários:");

							for (int i=0; i<usuarios.size(); i++) {
								System.out.println((i + 1) + " - " + usuarios.get(i));
							}
						}

						break;

					case 4:

						if (usuarios.isEmpty()) {

							System.out.println("Nenhum usuário cadastrado.");

						} else {

							System.out.println("\nSelecione um usuário:");

							for (int i=0; i<usuarios.size(); i++) {
								System.out.println((i + 1) + " - " + usuarios.get(i));
							}

							int usuarioLogin = sc.nextInt() - 1;
							sc.nextLine();

							System.out.print("Senha: ");
							String senha = sc.nextLine();

							Autenticavel autenticavel =
								(Autenticavel) usuarios.get(usuarioLogin);

							if (autenticavel.login(senha)) {

								System.out.println("Login realizado com sucesso!");

							} else {

								System.out.println("Senha incorreta.");
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