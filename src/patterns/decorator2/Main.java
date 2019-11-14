package patterns.decorator2;

public class Main {
	public static void main(String[] args) {
		Hamburguer hamburguer = new GrandeDecorator(new QueijoDecorator(new Hamburguer()));
		System.out.println(hamburguer.preco());
	}
}

class Hamburguer {
	public double preco() {
		return 50;
	}
}

class GrandeDecorator extends Hamburguer {
	private Hamburguer s;
	public GrandeDecorator(Hamburguer s) {
		this.s = s;
	}

	@Override
	public double preco() {
		return s.preco() * 2;
	}
}

class QueijoDecorator extends Hamburguer {
	private Hamburguer s;
	public QueijoDecorator(Hamburguer s) {
		this.s = s;
	}

	@Override
	public double preco() {
		return s.preco() + 10;
	}
}

