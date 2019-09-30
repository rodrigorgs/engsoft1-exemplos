package principios.srp;

import java.util.Scanner;

public class Ator {
	private String nome;
	private String sobrenome;

	public Ator() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro nome do ator ou da atriz: ");
		nome = scanner.nextLine();
		System.out.print("Digite o sobrenome do ator ou da atriz: ");
		nome = scanner.nextLine();
		scanner.close();
	}
	
	public Ator(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
}
