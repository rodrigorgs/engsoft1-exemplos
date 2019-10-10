package principio.interfaces;

public abstract class Companhia {
	public void criarSoftware() {
		Empregado[] empregados = getEmpregados();
		
		for (Empregado empregado : empregados) {
			empregado.trabalhar();
		}
	}
	
	public abstract Empregado[] getEmpregados();
	
	public static void main(String[] args) {
		Companhia cubos = new Cubos();
		cubos.criarSoftware();
		System.out.println("------------");
		Companhia xerox = new Xerox();
		xerox.criarSoftware();
	}
}
