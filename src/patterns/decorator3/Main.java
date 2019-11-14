package patterns.decorator3;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		
		String usuarioAutenticado = "admin";
		
		Acao[] acoes = {new AcaoInserir(), new AcaoVisualizar()};
		
		for (int i = 0; i < acoes.length; i++) {
			AutenticacaoDecorator authDecorator = new AutenticacaoDecorator(acoes[i]);
			authDecorator.setUsuario(usuarioAutenticado);
			acoes[i] = new LoggingDecorator(authDecorator);
		}
		
		for (Acao acao : acoes) {
			acao.executar();
		}
	}
}

interface Acao {
	void executar();
}

abstract class AcaoDecorator implements Acao {
	protected Acao acaoDecorada;

	public AcaoDecorator(Acao acaoDecorada) {
		super();
		this.acaoDecorada = acaoDecorada;
	}
}

class LoggingDecorator extends AcaoDecorator {
	public LoggingDecorator(Acao acaoDecorada) {
		super(acaoDecorada);
	}

	@Override
	public void executar() {
		System.out.println("Operação iniciada às " + new Date());
		acaoDecorada.executar();
	}
}

class AutenticacaoDecorator extends AcaoDecorator {
	private String usuario = "anonimo";
	
	public AutenticacaoDecorator(Acao acaoDecorada) {
		super(acaoDecorada);
	}
	
	@Override
	public void executar() {
		if (!usuario.equals("anonimo")) {
			acaoDecorada.executar();
		}
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}

class AcaoInserir implements Acao {
	@Override
	public void executar() {
		System.out.println("Inserindo registro no banco de dados");
	}
}

class AcaoVisualizar implements Acao {
	@Override
	public void executar() {
		System.out.println("Visualizando registro no banco de dados");
	}
}