package Questao_07;

import java.util.HashSet;

public class Conjunto {

	private HashSet<String> elementos =
		new HashSet<String>();

	// adicionar elemento
	public void adicionarElemento(String elemento) {

		if (elemento == null || elemento.isEmpty()) {
			throw new IllegalArgumentException("O elemento não pode ser vazio.");
		}

		elementos.add(elemento);
	}

	// verificar elemento
	public boolean pertence(String elemento) {

		return elementos.contains(elemento);
	}

	// união
	public Conjunto uniao(Conjunto outro) {

		Conjunto novo =
			new Conjunto();

		novo.elementos.addAll(this.elementos);
		novo.elementos.addAll(outro.elementos);

		return novo;
	}

	// interseção
	public Conjunto inter(Conjunto outro) {

		Conjunto novo =
			new Conjunto();

		for (String elemento : this.elementos) {

			if (outro.elementos.contains(elemento)) {

				novo.elementos.add(elemento);
			}
		}

		return novo;
	}

	// diferença
	public Conjunto menos(Conjunto outro) {

		Conjunto novo =
			new Conjunto();

		for (String elemento : this.elementos) {

			if (!(outro.elementos.contains(elemento))) {

				novo.elementos.add(elemento);
			}
		}

		return novo;
	}

	@Override
	public String toString() {

		return elementos.toString();
	}
}