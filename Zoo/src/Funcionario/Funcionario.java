package Funcionario;

import Animais.Humano;

public abstract class Funcionario extends Humano{
	
	
	protected int salario;
	protected String cargo;
	protected boolean equipamento;
	
	
	protected abstract void horaAlmoco();
	
	protected abstract void salario();
	
	protected abstract void tempoTrabalho();
	
	
	
	
}
