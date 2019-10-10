package principio.interfaces;

public class Xerox extends Companhia {

	@Override
	public Empregado[] getEmpregados() {
		return new Empregado[] {
				new Designer(), 
				new Designer(),
		};
	}

}
