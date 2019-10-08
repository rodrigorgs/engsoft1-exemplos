package principios.ocp2;

public class Circulo implements Forma {

	private double raio;
	
	@Override
	public String getNome() {
		return "circulo";
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double getArea() {
		return Math.PI * raio * raio;
	}
}
