package Animais;

public abstract class Animal {

	protected String nome;
	protected int idade;
	protected String genero;
	
	
	protected abstract void alimentar();
	
	protected abstract void descansar();
	
	protected abstract void respirar();
	
	
}
