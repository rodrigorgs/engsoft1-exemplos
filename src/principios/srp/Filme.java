package principios.srp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Filme {
	private String titulo;
	private int anoLancamento;
	private Collection<Ator> atores;
	
	public Filme() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o titulo do filme: ");
		titulo = scanner.nextLine();
		System.out.print("Digite o ano de lancamento do filme: ");
		anoLancamento = scanner.nextInt();
		scanner.skip("\n");
		
		atores = new ArrayList<Ator>();		
		System.out.println("Voce deseja adicionar um ator (s/n)? ");
		String sn = scanner.nextLine();
		while (sn.equals("s")) {
			Ator ator = new Ator();
			atores.add(ator);
			System.out.println("Voce deseja adicionar um ator (s/n)? ");
			sn = scanner.nextLine();
		}
		
		scanner.close();
	}
	
	public Filme(String titulo, int anoLancamento, Collection<Ator> atores) {
		super();
		this.titulo = titulo;
		this.anoLancamento = anoLancamento;
		this.atores = new ArrayList<Ator>();
		this.atores.addAll(atores);
	}

	public void imprime() {
		System.out.println(titulo + "(" + anoLancamento + ")");
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public Collection<Ator> getAtores() {
		return Collections.unmodifiableCollection(atores);
	}
}
