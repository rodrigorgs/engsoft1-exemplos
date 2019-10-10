package principios.demeter;

public class EntregadorDePizza {
	Carteira carteira;
	
	public void entrega(Cliente cliente) {
		double valor = 30.0;
		
		if (cliente.podePagar(valor)) {
			cliente.pagar(valor);
			carteira.adicionarDinheiro(valor);
		}
	}
}
