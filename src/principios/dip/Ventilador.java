package principios.dip;

public class Ventilador {

	private boolean ligado = false;
	
	public void ligar() {
		ligado = true;
		System.out.println("Ventilador ventilando");
	}
	public void desligar() {
		ligado = false;
		System.out.println("Ventilador parado");
	}
	
	public boolean isLigado() {
		return ligado;
	}
}
