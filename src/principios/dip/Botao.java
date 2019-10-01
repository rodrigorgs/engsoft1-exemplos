package principios.dip;

import java.util.Scanner;

public class Botao {
	private Lampada equipamento;
	
	public Botao(Lampada equipamento) {
		super();
		this.equipamento = equipamento;
	}

	public void executar() {
		Scanner scanner = new Scanner(System.in);
		
		String opcao;
		do {
			System.out.print("(l)igar, (d)esligar ou (s)air? ");
			opcao = scanner.nextLine().trim();
			if (opcao.equals("l")) {
				equipamento.acender();
			} else if (opcao.equals("d")) {
				equipamento.apagar();
			}
		} while (!opcao.equals("s"));
		
		scanner.close();
	}
}
