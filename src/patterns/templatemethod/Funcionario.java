package patterns.templatemethod;

abstract class Funcionario {

	double salario;
	
	protected abstract double calcDescontosPrevidencia();

	protected abstract double calcDescontosPlanoSaude();

	protected abstract double calcOutrosDescontos();

	public double calcSalarioLiquido() { // template method
		double prev = calcDescontosPrevidencia();
		double saude = calcDescontosPlanoSaude();
		double outros = calcOutrosDescontos();
		return salario - prev - saude - outros;
	}
	
	public static void main(String[] args) {
		Funcionario f = new FuncionarioPublico();
		f.salario = 1200.0;
		System.out.println(f.calcSalarioLiquido());
	}
}

class FuncionarioPublico extends Funcionario {
	@Override
	protected double calcDescontosPrevidencia() {
		return salario * 0.20;
	}

	@Override
	protected double calcDescontosPlanoSaude() {
		return 0.0;
	}

	@Override
	protected double calcOutrosDescontos() {
		return salario * 0.10;
	}
}

class FuncionarioCLT extends Funcionario {
	@Override
	protected double calcDescontosPrevidencia() {
		return salario * 0.10;
	}

	@Override
	protected double calcDescontosPlanoSaude() {
		return 100.0;
	}

	@Override
	protected double calcOutrosDescontos() {
		return 0;
	}
}