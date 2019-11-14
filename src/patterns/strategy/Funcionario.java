package patterns.strategy;

interface SalarioLiquidoStrategy {
	double calcSalarioLiquido(double salario);
}

class SalarioLiquidoPublicoStrategy implements SalarioLiquidoStrategy {
	@Override
	public double calcSalarioLiquido(double salario) {
		return salario * 0.7;
	}
}

class SalarioLiquidoCLTStrategy implements SalarioLiquidoStrategy {
	@Override
	public double calcSalarioLiquido(double salario) {
		return salario * 0.9 - 100.0;
	}
}

public class Funcionario {
	SalarioLiquidoStrategy strategy;
	double salario;
	

	public double calcSalarioLiquido() { // template method
		if (strategy == null) {
			return salario;
		} else {
			return strategy.calcSalarioLiquido(salario);
		}
	}
	
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.salario = 1200.0;
		f.strategy = new SalarioLiquidoCLTStrategy();
		System.out.println(f.calcSalarioLiquido());
		f.strategy = new SalarioLiquidoPublicoStrategy();
		System.out.println(f.calcSalarioLiquido());
	}
}
