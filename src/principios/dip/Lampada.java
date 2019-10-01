package principios.dip;

public class Lampada {

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
}
