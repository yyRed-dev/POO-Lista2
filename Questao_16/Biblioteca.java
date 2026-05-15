package Questao_16;

import java.util.HashMap;
import java.util.Map;

public class Biblioteca {

	private HashMap<String, String> livros = new HashMap<String, String>();

	// adicionar livro
	public void adicionarLivro(String isbn, String titulo) {

		if (isbn == null || isbn.isEmpty()) {
			throw new IllegalArgumentException("O ISBN não pode ser vazio.");
		}

		if (titulo == null || titulo.isEmpty()) {
			throw new IllegalArgumentException("O título não pode ser vazio.");
		}

		livros.put(isbn, titulo);
	}

	// remover livro
	public void removerLivro(String isbn) {

		if (!(livros.containsKey(isbn))) {
			throw new IllegalArgumentException("Livro não encontrado.");
		}

		livros.remove(isbn);
	}

	// buscar livro
	public String buscarLivro(String isbn) {

		if (!(livros.containsKey(isbn))) {
			throw new IllegalArgumentException("Livro não encontrado.");
		}

		return livros.get(isbn);
	}

	// verificar livro
	public boolean verificarLivro(String isbn) {
		return livros.containsKey(isbn);
	}

	// mostrar livros
	public void mostrarLivros() {

		if (livros.isEmpty()) {

			System.out.println("Nenhum livro cadastrado.");

		} else {

			System.out.println("\nLista de Livros:");

			for (Map.Entry<String, String> item : livros.entrySet()) {

				System.out.println(
					"ISBN: " + item.getKey() +
					" | Título: " + item.getValue()
				);
			}
		}
	}
}