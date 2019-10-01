package principios.lsp;

public class Main {

	public static void testaRetangulo(Retangulo retangulo) {
		retangulo.setLargura(3);
		retangulo.setAltura(4);
		
		double areaCalculada = retangulo.getLargura() * retangulo.getAltura();
		double areaCorreta = 12.0;
		System.out.println("Area esta correta? " + (areaCalculada == areaCorreta));
	}
	
	public static void main(String[] args) {
		Retangulo retangulo1 = new Retangulo();
		Quadrado retangulo2 = new Quadrado();
		
		testaRetangulo(retangulo1);
		testaRetangulo(retangulo2);
	}
}
