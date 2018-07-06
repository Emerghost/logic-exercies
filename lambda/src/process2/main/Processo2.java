package process2.main;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import process1.interfaces.Condicao;
import process1.models.Pessoa;

public class Processo2 {

	public static void main(String[] args) {
		List<Pessoa> pessoas = Arrays.asList(new Pessoa("Charles", "Babbage", 80), new Pessoa("Claude", "Shannon", 85),
				new Pessoa("Alan", "Turing", 42), new Pessoa("John", "von Neumann", 54),
				new Pessoa("William", "Shockley", 79), new Pessoa("Douglas", "Engelbart", 88),
				new Pessoa("Robert", "Noyce", 63), new Pessoa("Steve", "Wozniak", 67),
				new Pessoa("Grace", "Hopper", 86), new Pessoa("Vint", "Cerf", 74), new Pessoa("Steve", "Jobs", 56),
				new Pessoa("Linus", "Torvalds", 48), new Pessoa("Bill", "Gates", 62),
				new Pessoa("Ada", "Lovelace", 36));

		// Passo 1: Vamos ordenar a lista por sobrenome
		Collections.sort(pessoas,(p1,p2) -> p1.getSobreNome().compareTo(p2.getSobreNome()));

		// Passo 2: Imprimir todos os elementos da lista
		System.out.println("\nImprimindo todas as pessoas:");
		imprimirSobrenomeCondicionalmente(pessoas, p -> true);

		// Passo 3: Imprimir todas as pessoas cujo sobrenome começa com C
		System.out.println("Imprimindo todas as pessoas cujo sobrenome começa com C:");
		imprimirSobrenomeCondicionalmente(pessoas, p -> p.getSobreNome().startsWith("C"));

		System.out.println("Imprimindo nomes com mais de cinco letras: ");
		imprimirSobrenomeCondicionalmente(pessoas, p -> p.getNome().length() > 5);
		
	}

	public static void imprimirSobrenomeCondicionalmente(final List<Pessoa> pessoas, final Condicao condicao) {
		for (Pessoa p : pessoas) {
			if (condicao.testar(p)) {
				System.out.println(p);
			}
		}
	}

	public static void imprimirTodas(final List<Pessoa> pessoas) {
		for (Pessoa p : pessoas) {
			System.out.println(p);
		}
	}
	

}
