package principios.lsp;

public class Quadrado extends Retangulo {

	@Override
	public void setLargura(double largura) {
		this.largura = largura;
		this.altura = largura;
	}

	@Override
	public void setAltura(double altura) {
		this.largura = altura;
		this.altura = altura;
	}
	
}
