package principios.dip2;

public class Main {

	public static void main(String[] args) {
//		Lampada lampada = new Lampada();
		Ventilador ventilador = new Ventilador();
		Botao botao = new Botao(ventilador);
		botao.executar();
	}
}
