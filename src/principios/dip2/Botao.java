package principios.dip2;

import java.util.Scanner;

public class Botao {
	private Equipamento equipamento;
	
	public Botao(Equipamento equipamento) {
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
				equipamento.ligar();
			} else if (opcao.equals("d")) {
				equipamento.desligar();
			}
		} while (!opcao.equals("s"));
		
		scanner.close();
	}
}
