package examples;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> nomes = new HashSet<>();
		System.out.println(nomes.add("Emerson"));
		System.out.println(nomes.add("Fulano"));
		System.out.println(nomes.add("Ciclano"));
		System.out.println(nomes.add("Beltrano"));
		
		System.out.println(nomes);
		
		System.out.println(nomes.add("Emerson"));
		
		nomes.add("João");
		nomes.add("Maria");
		
		System.out.println(nomes);
		
	}

}
