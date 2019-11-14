package patterns.factorymethod;

/// Meu programa

public class Main {
	public static void main(String[] args) {
		CriadorDeTelas criador = new CriadorDeTelasWindows();
		criador.criaTelaLogin();
	}
}

class CriadorDeTelasWindows extends CriadorDeTelas {

	@Override
	public Button criaBotao() {
		return new ButtonWindows();
	}

	@Override
	public TextField criaTextField() {
		return new TextFieldWindows();
	}
	
}

class CriadorDeTelasFlat extends CriadorDeTelas {

	@Override
	public Button criaBotao() {
		return new ButtonFlat();
	}

	@Override
	public TextField criaTextField() {
		return new TextFieldFlat();
	}
	
}

///////////////////////////////

/// Framework de criação de telas genéricas

interface Button {
	void setText(String text);
	void draw();
}

interface TextField {
	void setText(String text);
	String getText();
	void draw();
}

abstract class CriadorDeTelas {
    public void criaTelaLogin() {
        TextField txtUsuario = criaTextField();
        TextField txtSenha = criaTextField();
        Button btnLogin = criaBotao();
        btnLogin.setText("Login");
        
        txtUsuario.draw();
        txtSenha.draw();
        btnLogin.draw();
    }

    public void criaTelaLogout() {
        Button btnLogout = criaBotao();
        btnLogout.setText("Logout");
        
        btnLogout.draw();
    }

    public abstract Button criaBotao();
    public abstract TextField criaTextField();
}

//////////////////////////

// Biblioteca de componentes gráficos flat

class ButtonFlat implements Button {
	private String text = "";
	
	@Override
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public void draw() {
		System.out.println("[ " + text + " ]");
	}
}

class TextFieldFlat implements TextField {

	@Override
	public void setText(String text) {
	}

	@Override
	public String getText() {
		return null;
	}

	@Override
	public void draw() {
		System.out.println("____________");
	}
	
}

//////////////////////////

//Biblioteca de componentes gráficos Windows

class ButtonWindows implements Button {
	private String text = "";
	
	@Override
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public void draw() {
		System.out.println("< " + text + " >");
	}
}

class TextFieldWindows implements TextField {

	@Override
	public void setText(String text) {
	}

	@Override
	public String getText() {
		return null;
	}

	@Override
	public void draw() {
		System.out.println("_ _ _ _ _ _ _ _ _");
	}
	
}