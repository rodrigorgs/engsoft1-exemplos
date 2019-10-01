package principios.ocp;

public class CalculadoraDeArea {
	public static double calculaAreaTotal(Forma[] formas) {
		double total = 0.0;
		
		for (Forma forma : formas) {
			if (forma instanceof Retangulo) {
				Retangulo retangulo = (Retangulo)forma;
				total += retangulo.getLargura() * retangulo.getAltura();
			} else if (forma instanceof Circulo) {
				Circulo circulo = (Circulo)forma;
				total += 2 * Math.PI * circulo.getRaio();
			}
		}
		
		return total;
	}
}
