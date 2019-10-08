package principios.srp2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeitorDeFilme {
	private LeitorDeAtor leitor = new LeitorDeAtor();
	
	public LeitorDeFilme(LeitorDeAtor leitor) {
		super();
		this.leitor = leitor;
	}

	public Filme leFilme() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o titulo do filme: ");
		String titulo = scanner.nextLine();
		System.out.print("Digite o ano de lancamento do filme: ");
		int anoLancamento = scanner.nextInt();
		scanner.skip("\n");
		
		List<Ator> atores = new ArrayList<Ator>();		
		System.out.println("Voce deseja adicionar um ator (s/n)? ");
		String sn = scanner.nextLine();
		while (sn.equals("s")) {
			Ator ator = leitor.leAtor();
			atores.add(ator);
			System.out.println("Voce deseja adicionar um ator (s/n)? ");
			sn = scanner.nextLine();
		}
				
		scanner.close();
		
		Filme filme = new Filme(titulo, anoLancamento, atores);
		return filme;
	}
}
