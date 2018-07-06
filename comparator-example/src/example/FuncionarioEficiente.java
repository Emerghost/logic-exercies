package example;



public class FuncionarioEficiente implements Comparable<FuncionarioEficiente> {
	private String nome;
	private Double salario;
	private CargoEnum cargo;

	public FuncionarioEficiente(String nome, Double salario, CargoEnum cargo) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}
	// -1 ,0 , 1 - servem mais como indicadores de ordem crescente ou decrescente na lista
	@Override
	public int compareTo(FuncionarioEficiente f) {
		if (f.getCargo().equals(this.cargo)) {
			return 0;
		} else if (f.getCargo().equals(CargoEnum.GERENTE) && this.getCargo().equals(CargoEnum.DESENVOLVEDOR)) {
			return 1;
		} else {
			return -1;
		}
	}

	public String getNome() {
		return nome;
	}

	public CargoEnum getCargo() {
		return cargo;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + ", cargo=" + cargo + "]";
	}

}


