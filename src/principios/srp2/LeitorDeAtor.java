package principios.srp2;

import java.util.Scanner;

public class LeitorDeAtor {
	public Ator leAtor() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro nome do ator ou da atriz: ");
		String nome = scanner.nextLine();
		System.out.print("Digite o sobrenome do ator ou da atriz: ");
		String sobrenome = scanner.nextLine();
		
		Ator ator = new Ator(nome, sobrenome);
		scanner.close();
		
		return ator;
	}
}
