package main;

import model.Animal;
import model.CorpoHumano;

public class TestInnerClass {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Animal.Coracao coracao = animal.new Coracao();
		coracao.bater(false);
		
		Animal.Cerebro cerebro = animal.new Cerebro();
		cerebro.pensarEm("viajar");
		cerebro.pensarEm("Como ficar rico em menos de 30 minutos");
		
		CorpoHumano corpoHumano = new CorpoHumano();
		corpoHumano.existir();
		
	}
}
