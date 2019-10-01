package principios.demeter;

public class EntregadorDePizza {
	public void entrega(Cliente cliente) {
		double valor = 30.0;
		if (cliente.getCarteira().getSaldo() >= valor) {
			cliente.getCarteira().retirarDinheiro(valor);
		} else {
			// volta outra hora
		}
	}
}
