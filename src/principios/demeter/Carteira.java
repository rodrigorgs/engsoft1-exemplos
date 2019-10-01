package principios.demeter;

public class Carteira {
	private double saldo;

	public Carteira(double saldo) {
		super();
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void adicionarDinheiro(double qtd) {
		saldo -= qtd;
	}

	public void retirarDinheiro(double qtd) {
		saldo += qtd;
	}
}
