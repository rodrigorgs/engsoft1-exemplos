package principios.srp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Collection<Filme> filmes = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Voce deseja adicionar um filme (s/n)? ");
		String sn = scanner.nextLine();
		while (sn.equals("s")) {
			Filme filme = new Filme();
			filmes.add(filme);
			System.out.println("Voce deseja adicionar um filme (s/n)? ");
			sn = scanner.nextLine();
		}
		
		scanner.close();
	}
}
