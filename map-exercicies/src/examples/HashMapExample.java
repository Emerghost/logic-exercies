package examples;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// Mapa representando (companhia, valor das ações) como par chave/valor
		HashMap<String, Double> acoesEmpresas = new HashMap<>();
		acoesEmpresas.put("Apple", new Double(91.98));
		acoesEmpresas.put("Sony", new Double(16.76));
		acoesEmpresas.put("Dell", new Double(30.67));
		acoesEmpresas.put("HP", new Double(33.91));
		acoesEmpresas.put("IBM", new Double(181.71));
		
		// Mostra conteudo do HashMap
		System.out.println("Conteúdo do HashMap: " + acoesEmpresas);
		
		// Imprime a chave e seu valor correspondente no mapa
		for (String chave : acoesEmpresas.keySet()) {
			System.out.println(chave + ": \t " + acoesEmpresas.get(chave));
			
		}
		
		// Recuperando valor para uma chave
		System.out.println("\nO preço da ação da HP é: " + acoesEmpresas.get("IBM"));
		
		//Exibe a quantidade de eleentos que o mapa possui
		System.out.println("\nO tamanho do mapa é: " + acoesEmpresas.size());
		
		// Mostra se o mapa está vazio ou não
		System.out.println("\nO mapa está vazio? " + acoesEmpresas.isEmpty());
		
		System.out.println("\nO mapa possui a chave Dell? " + acoesEmpresas.containsKey("Dell"));
		System.out.println("\nAlguma empresa possui ação de valor 99.99? " + acoesEmpresas.containsValue(99.99));
		
		System.out.println("\nRemover Dell: " + acoesEmpresas.remove("Dell"));
		System.out.println("\nEstado do mapa: " + acoesEmpresas);
		
		acoesEmpresas.clear();
		System.out.println("\nConteudo do mapa após \"cleaar\":" + acoesEmpresas);
	}

}
