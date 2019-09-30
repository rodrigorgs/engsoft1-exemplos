package principios.isp;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

	public static void main(String[] args) {
		Collection<Aluno> alunos = new ArrayList<>();
		alunos.add(new AlunoUFBA("Fulano"));
		alunos.add(new AlunoUFBA("Sicrana"));
		alunos.add(new AlunoUFBA("Beltrana"));
		
		Escalonamento escalonamento = new Escalonamento(alunos);
		escalonamento.imprime();
	}
}
