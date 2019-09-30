package principios.isp;

import java.util.ArrayList;
import java.util.Collection;

public class Escalonamento {
	private Collection<Aluno> pessoas = new ArrayList<Aluno>();

	public Escalonamento(Collection<Aluno> pessoas) {
		super();
		this.pessoas.addAll(pessoas);
	}
	
	public void imprime() {
		int i = 1;
		for (Aluno pessoa : pessoas) {
			System.out.println(i + ". " + pessoa.getNome());
			i++;
		}
	}
}
