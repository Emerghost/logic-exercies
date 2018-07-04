package examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsBenchmark {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		// 1) Adiciona no Final
		long tempo = ListsBenchmark.adicionaNoFinal(arrayList);
		System.out.println("ArrayList (final): " + tempo + " ms");
		
		tempo = ListsBenchmark.adicionaNoFinal(linkedList);
		System.out.println("LinkedList (final): " + tempo + " ms");
		
		//2) Adiciona no começo
		
		tempo = ListsBenchmark.adicionaNoComeco(linkedList);
		System.out.println("LinkedList (começo): " + tempo + " ms");
		
		tempo = ListsBenchmark.adicionaNoComeco(linkedList);
		System.out.println("LinkedList (começo): " + tempo + " ms");
		
		//3) Get
		tempo = ListsBenchmark.get(linkedList);
		System.out.println("LinkedList (get): " + tempo + " ms");
		
		tempo = ListsBenchmark.get(linkedList);
		System.out.println("LinkedList (get): " + tempo + " ms");

	}
	public static long adicionaNoFinal(final List<Integer> lista) {
		long inicio = System.currentTimeMillis();
		int tamanho = 100000;
		
		for (int i = 0; i < tamanho; i++) {
			lista.add(i);
			
		}
		
		long fim = System.currentTimeMillis();
		
		return fim - inicio;
	}
	public static long adicionaNoComeco(final List<Integer> lista) {
		long inicio = System.currentTimeMillis();
		int tamanho = 100000;
		
		for (int i = 0; i < tamanho; i++) {
			lista.add(i);
			
		}
		
		long fim = System.currentTimeMillis();
		
		return fim - inicio;
	}
	
	public static long get(final List<Integer> lista) {
		int tamanho = 100000;
		
		for (int i 	= 0; i < tamanho; i++) {
			lista.add(i);
		}
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i < tamanho; i++) {
			lista.get(i);
		}
		
		long fim = System.currentTimeMillis();
		
		return fim - inicio;
	}
	

}
