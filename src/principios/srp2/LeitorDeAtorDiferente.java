package principios.srp2;

public class LeitorDeAtorDiferente extends LeitorDeAtor {

	@Override
	public Ator leAtor() {
		System.out.println("Este é um leitor diferente.");
		return super.leAtor();
	}
	
}
