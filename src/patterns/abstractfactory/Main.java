package patterns.abstractfactory;

/// Meu programa

public class Main {
	public static void main(String[] args) {
		FabricaDeComponentes fabrica1 = new FabricaDeComponentesFlat();
		FabricaDeComponentes fabrica2 = new FabricaDeComponentesWindows();
		CriadorDeTelas criador = new CriadorDeTelas(fabrica1);
		criador.criaTelaLogin();
		
		System.out.println();
		
		criador.setFabrica(fabrica2);
		criador.criaTelaLogout();
	}
}

class FabricaDeComponentesFlat extends FabricaDeComponentes {

	@Override
	public TextField criaTextField() {
		return new TextFieldFlat();
	}

	@Override
	public Button criaBotao() {
		return new ButtonFlat();
	}
	
}

class FabricaDeComponentesWindows extends FabricaDeComponentes {

	@Override
	public TextField criaTextField() {
		return new TextFieldWindows();
	}

	@Override
	public Button criaBotao() {
		return new ButtonWindows();
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

abstract class FabricaDeComponentes {
	public abstract TextField criaTextField();
	public abstract Button criaBotao();
}

class CriadorDeTelas {
	private FabricaDeComponentes fabrica;
	
	public CriadorDeTelas(FabricaDeComponentes fabrica) {
		this.fabrica = fabrica;
	}
	
	public void setFabrica(FabricaDeComponentes fabrica) {
		this.fabrica = fabrica;
	}
	
    public void criaTelaLogin() {
        TextField txtUsuario = fabrica.criaTextField();
        TextField txtSenha = fabrica.criaTextField();
        Button btnLogin = fabrica.criaBotao();
        btnLogin.setText("Login");
        
        txtUsuario.draw();
        txtSenha.draw();
        btnLogin.draw();
    }

    public void criaTelaLogout() {
        Button btnLogout = fabrica.criaBotao();
        btnLogout.setText("Logout");
        
        btnLogout.draw();
    }
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