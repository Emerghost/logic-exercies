package examples;

import java.util.ArrayList;


public class ListExample {
	public static void main(String[] args) {
			ArrayList listaSemParametrizacao = new ArrayList();
			listaSemParametrizacao.add(12);
			listaSemParametrizacao.add("Java");
			listaSemParametrizacao.add(Boolean.FALSE);
			
			
		System.out.println(listaSemParametrizacao);
		//Ela vai funcionar como se estivesse recebendo Object
		
		//Dessa forma, n�o:
		ArrayList<Integer> listaDeInteiros = new ArrayList();
		
		//add - adiciona um elemento no final da lista
		listaDeInteiros.add(1);
		listaDeInteiros.add(2);
		
		System.out.println("ListaDeInteiros: " + listaDeInteiros);
		
		// add(index) - adiciona um elemento na lista em posi��o espec�fica
		//desde que essa posi��o seja (no maximo) uma a mais do m�ximo �ndice da lista
		listaDeInteiros.add(2,3);
		listaDeInteiros.add(2, 4);
		System.out.println("add(index): " + listaDeInteiros);
	}
}
