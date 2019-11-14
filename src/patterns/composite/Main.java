package patterns.composite;

import java.util.ArrayList;

public class Main {
	private static ArrayList<Produto> conta = new ArrayList<>();
	
	public static void main(String[] args) {
		conta.add(new Pao());
		conta.add(new Queijo());
		
		ProdutoComposto xSalada = new ProdutoComposto("X-salada");
		xSalada.adicionar(new Pao());
		xSalada.adicionar(new Queijo());
		xSalada.adicionar(new Salada());
		
		ProdutoComposto combo1 = new ProdutoComposto("Combo 1");
		combo1.adicionar(xSalada);
		combo1.adicionar(new Queijo());
		conta.add(combo1);
		
		for (Produto produto : conta) {
			System.out.println(produto.nome() + ": " + produto.preco());
		}
	}
}

interface Produto {
	double preco();
	String nome();
}

class ProdutoComposto implements Produto {
	private ArrayList<Produto> produtos = new ArrayList<>();
	private String nome;
	
	public ProdutoComposto(String nome) {
		this.nome = nome;
	}
	
	@Override
	public double preco() {
		double total = 0;
		for (Produto produto : produtos) {
			total += produto.preco();
		}
		return total;
	}
	
	public void adicionar(Produto p) {
		produtos.add(p);
	}
	
	public void remover(Produto p) {
		produtos.remove(p);
	}

	@Override
	public String nome() {
		String x = "";
		for (Produto produto : produtos) {
			x += produto.nome() + ",";
		}
		return nome + "(" + x + ")";
	}
}

class Queijo implements Produto {
	@Override
	public double preco() {
		return 10;
	}

	@Override
	public String nome() {
		return "Queijo";
	}
}

class Salada implements Produto {
	@Override
	public double preco() {
		return 5;
	}
	@Override
	public String nome() {
		return "Salada";
	}
}

class Pao implements Produto {
	@Override
	public double preco() {
		return 2;
	}
	@Override
	public String nome() {
		return "Pao";
	}
}