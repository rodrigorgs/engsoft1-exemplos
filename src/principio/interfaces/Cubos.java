package principio.interfaces;

public class Cubos extends Companhia {

	@Override
	public Empregado[] getEmpregados() {
		return new Empregado[] {
				new Designer(), 
				new Programador(),
		};
	}

}
