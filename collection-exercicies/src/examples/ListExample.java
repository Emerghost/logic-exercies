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
		
		//Dessa forma, não:
		ArrayList<Integer> listaDeInteiros = new ArrayList();
		
		//add - adiciona um elemento no final da lista
		listaDeInteiros.add(1);
		listaDeInteiros.add(2);
		
		System.out.println("ListaDeInteiros: " + listaDeInteiros);
		
		// add(index) - adiciona um elemento na lista em posição específica
		//desde que essa posição seja (no maximo) uma a mais do máximo índice da lista
		listaDeInteiros.add(2,3);
		listaDeInteiros.add(2, 4);
		
		System.out.println("add(index): " + listaDeInteiros);
		
		//size - mostra a quantidade de elementos na lista
		int quantidade = listaDeInteiros.size();
		System.out.println("size: " + quantidade);
		
		//clear - remove os elementos na lista
		listaDeInteiros.clear();
		quantidade = listaDeInteiros.size();
		System.out.println("clear: " + quantidade);
		
		// Enchendo a lista novamente...
		listaDeInteiros.add(10);
		listaDeInteiros.add(11);
		listaDeInteiros.add(12);
		
		//contains(objeto) - verifica se um elemento existe na coleção
		boolean resultado = listaDeInteiros.contains(12);
		System.out.println("contains(objeto): " + resultado);
		
		//remove(obj) - remove um determinado objeto da lista
		// Porque fazer o Integer.valueOF()? Porque o construtor é ligeiramente mais caro
		//Se não fizermos isso, o Eclipse chama o outro metodo "remove" (sobrecarga)
		boolean foiRemovido = listaDeInteiros.remove(Integer.valueOf(11));
		System.out.println("remove(object): " + listaDeInteiros);
		System.out.println("removido? " + foiRemovido);
		
		// remove(index) - remove um elemento em uma posição específica da lista
		Integer itemRemovido = listaDeInteiros.remove(0);
		System.out.println("remove(obj0: " + listaDeInteiros);
		System.out.println("removido: " + itemRemovido);
		
		// set(index,obj) - coloca um elemento em um determinado indice
		//não pode ser um indice inexistente na lista
		Integer elementoQueEstavaLaAntes = listaDeInteiros.set(0, 32);
		System.out.println("set(index,obj): " + listaDeInteiros);
		System.out.println("elementoQueEstavaLaAntes: " + elementoQueEstavaLaAntes);
		
		// Enchendo a lista novamente...
				listaDeInteiros.add(10);
				listaDeInteiros.add(11);
				listaDeInteiros.add(12);
		
		// get(index) - devolve o elemento que está na posição especifica
		Integer elementoQueEstaNoIndice = listaDeInteiros.get(1);
		System.out.println("ListaDeInteiros: " + listaDeInteiros);
		System.out.println("elementoQueEstaNoIndice: " + elementoQueEstaNoIndice);
		
		int index = listaDeInteiros.indexOf(11);
		System.out.println("listaDeInteiros: " + listaDeInteiros);
		System.out.println("index: " + index);
		
		//Criando outra lista de numeros
		ArrayList<Integer> outraLista  = new ArrayList<>();
		outraLista.add(100);
		outraLista.add(99);
		outraLista.add(98);
		
		//addAll(collection) - adiciona uma coleção dentro de outra, desde que tenham paratrizações semelhantes
		listaDeInteiros.addAll(outraLista);
		
		System.out.println("listaDeInteiros com outraLista: " + listaDeInteiros);
		
	}
}
