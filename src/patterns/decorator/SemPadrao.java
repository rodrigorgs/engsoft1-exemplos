package patterns.decorator;

public class SemPadrao {
	public static void main(String[] args) {
		HamburguerOld hamburguer = new HamburguerGrande();
		System.out.println(hamburguer.preco());
	}
}

class HamburguerOld {
	public double preco() {
		return 50;
	}
}

class HamburguerComQueijo extends HamburguerOld {
	@Override
	public double preco() {
		return super.preco() + 10;
	}
}

class HamburguerGrande extends HamburguerOld {
	@Override
	public double preco() {
		return super.preco() * 2;
	}
}
