package principios.dip;

public class Main {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		Botao botao = new Botao(lampada);
		botao.executar();
	}
}
