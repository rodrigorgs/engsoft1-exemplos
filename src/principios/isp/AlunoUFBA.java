package principios.isp;

public class AlunoUFBA implements Aluno {
	private String nome;
	private Curso curso;
	private double mediaGeral;
	private static final Universidade ufba = new Universidade("UFBA");
	
	public AlunoUFBA(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public Curso getCurso() {
		return curso;
	}

	@Override
	public Universidade getUniversidade() {
		return ufba;
	}

	@Override
	public double getMediaGeral() {
		return mediaGeral;
	}

}
