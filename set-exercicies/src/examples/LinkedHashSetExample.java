package examples;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<String> nomes = new LinkedHashSet<>();
		System.out.println(nomes.add("Emerson"));
		System.out.println(nomes.add("Fulano"));
		System.out.println(nomes.add("Ciclano"));
		System.out.println(nomes.add("Beltrano"));

		System.out.println(nomes);
		
		nomes.add("João");
		nomes.add("Maria");
		
		System.out.println(nomes);
		
		System.out.println(nomes.add("Emerson"));

	}

}
