package principios.ocp2;

public class CalculadoraDeArea {
	public static double calculaAreaTotal(Forma[] formas) {
		double total = 0.0;
		
		for (Forma forma : formas) {
			total += forma.getArea();
		}
		
		return total;
	}
}
