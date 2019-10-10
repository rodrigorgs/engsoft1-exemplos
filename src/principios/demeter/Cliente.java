package principios.demeter;

public class Cliente {
	private Carteira carteira;
	
	public Cliente(double valor) {
		carteira = new Carteira(valor);
	}

	public Carteira getCarteira() {
		return carteira;
	}
	
	public boolean podePagar(double valor) {
		return carteira.getSaldo() >= valor;
	}
	
	public void pagar(double valor) {
		carteira.retirarDinheiro(valor);
	}
}
