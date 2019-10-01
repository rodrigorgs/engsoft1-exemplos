package principios.ocp;

public class Retangulo implements Forma {
	private double largura;
	private double altura;
	
	@Override
	public String getNome() {
		return "retangulo";
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
