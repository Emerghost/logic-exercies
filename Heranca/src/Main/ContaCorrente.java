package Main;

public class ContaCorrente {

		private int codigo;
		private String correntista;
		private double saldo;
		private String banco;
		
		public double obterSaldo()
		{
			return this.saldo;
		}
		
		public void pagarConta() {
			System.out.println("Pagando Conta");
		}
		
	}

