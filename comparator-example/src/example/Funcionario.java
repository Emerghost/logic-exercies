package example;

public class Funcionario implements Comparable<Funcionario> {
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
	@Override
	public int compareTo(Funcionario f) {
		if(f.getCargo().equals(this.cargo)) {
			return 0;
		}else if(f.getCargo().equals(CargoEnum.GERENTE) &&
				this.getCargo().equals(CargoEnum.DESENVOLVEDOR)) {
			return 1;
		} else {
			return -1;
		}
		
	}
	
	public String toString() {
		return "Funcionario [\n\tnome=" + nome + ", \n\tsalario=" + salario + ", \n\tcargo=" + cargo + "]\n";
	}

}
