package Questao_13;

import java.util.ArrayList;

public class Boletim {

	private ArrayList<Double> notas = new ArrayList<Double>();

	// adicionar nota
	public void adicionarNota(double nota) {

		if (nota < 0 || nota > 10) {
			throw new IllegalArgumentException("A nota deve estar entre 0 e 10.");
		}

		notas.add(nota);
	}

	// calcular media
	public double calcularMedia() {

		if (notas.isEmpty()) {
			throw new IllegalArgumentException("Nenhuma nota cadastrada.");
		}

		double soma = 0;

		for (int i=0; i<notas.size(); i++) {
			soma += notas.get(i);
		}

		return soma / notas.size();
	}

	// maior nota
	public double maiorNota() {

		if (notas.isEmpty()) {
			throw new IllegalArgumentException("Nenhuma nota cadastrada.");
		}

		double maior = notas.get(0);

		for (int i=0; i<notas.size(); i++) {

			if (notas.get(i) > maior) {
				maior = notas.get(i);
			}
		}

		return maior;
	}

	// menor nota
	public double menorNota() {

		if (notas.isEmpty()) {
			throw new IllegalArgumentException("Nenhuma nota cadastrada.");
		}

		double menor = notas.get(0);

		for (int i=0; i<notas.size(); i++) {

			if (notas.get(i) < menor) {
				menor = notas.get(i);
			}
		}

		return menor;
	}

	// mostrar notas
	public void mostrarNotas() {

		if (notas.isEmpty()) {

			System.out.println("Nenhuma nota cadastrada.");

		} else {

			System.out.println("\nLista de Notas:");

			for (int i=0; i<notas.size(); i++) {
				System.out.println("Nota " + (i + 1) + ": " + notas.get(i));
			}
		}
	}
}