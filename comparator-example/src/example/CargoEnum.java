package example;

public enum CargoEnum {
	GERENTE(1),
	DESENVOLVEDOR(2);
	
	private Integer codigo;
	
	private CargoEnum(final Integer codigo) {
		
	}
	
	public Integer getCodigo() {
		return this.codigo;
	}
	
}
