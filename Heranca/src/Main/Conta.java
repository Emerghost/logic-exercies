package Main;

import java.math.BigDecimal;

public class Conta {
	
	private int codigo;
	private String correntista;
	private BigDecimal saldo;
	private String banco;
	
	protected BigDecimal obterSaldo() {
		return this.saldo;
	}

}
