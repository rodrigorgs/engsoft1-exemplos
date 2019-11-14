package patterns.decorator;

public class Main {
	public static void main(String[] args) {
		Sanduiche hamburguer = new Grande(new Queijo(new Hamburguer()));
		System.out.println(hamburguer.preco());
	}
}

interface Sanduiche {
	public double preco();
}

class Hamburguer implements Sanduiche {
	public double preco() {
		return 50;
	}
}

abstract class SanduicheDecorator implements Sanduiche {
	Sanduiche s;

	public SanduicheDecorator(Sanduiche s) {
		super();
		this.s = s;
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}

class Grande extends SanduicheDecorator {
	public Grande(Sanduiche s) {
		super(s);
	}

	@Override
	public double preco() {
		return s.preco() * 2;
	}
}

class Queijo extends SanduicheDecorator {
	public Queijo(Sanduiche s) {
		super(s);
	}

	@Override
	public double preco() {
		return s.preco() + 10;
	}
}

