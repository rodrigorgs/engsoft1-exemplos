package principios.dip2;

public class Lampada implements Equipamento {

	private boolean aceso = false;
	
	public void acender() {
		aceso = true;
		System.out.println("Lampada acesa");
	}
	public void apagar() {
		aceso = false;
		System.out.println("Lampada apagada");
	}
	
	public boolean isAceso() {
		return aceso;
	}
	@Override
	public void ligar() {
		acender();
	}
	@Override
	public void desligar() {
		apagar();
	}
}
