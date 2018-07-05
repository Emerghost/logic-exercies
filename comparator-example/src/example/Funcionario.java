package example;

public class Funcionario {
	private String nome;
	private Double salario;
	private CargoEnum cargo;
	
	
	
	public Funcionario(String nome, Double salario, CargoEnum cargo) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}
	public String getNome() {
		return nome;
	}
	public CargoEnum getCargo() {
		return cargo;
	}

}
