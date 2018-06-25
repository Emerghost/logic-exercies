package Main;

public class ContaPoupanca {
	
	private int codigo;
	private String correntista;
	private double saldo;
	private String banco;
	
	public double obterSaldo()
	{
		return this.saldo;
	}
	
	public void renderDinheiro()
	{
		System.out.println("Dinheiro rendeu!");
	}
}
