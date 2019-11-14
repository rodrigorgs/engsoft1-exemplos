package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Temperatura temperatura = new Temperatura();
		Termometro t1 = new Termometro("t1");
		Termometro t2 = new TermometroFahrenheit("t2");
		Termometro t3 = new Termometro("t3"); // nao quero atualizar
		ArCondicionado ar = new ArCondicionado();
		
		temperatura.addObserver(t1);
		temperatura.addObserver(t2);
		temperatura.addObserver(ar);
		
		temperatura.setTemperatura(20.0);
		temperatura.setTemperatura(10.0);
		temperatura.setTemperatura(30.0);
	}
}

interface TemperaturaObserver {
	void temperaturaMudou(double t);
}

class Temperatura {
	private double temperatura = 25.0;
	private List<TemperaturaObserver> observers = new ArrayList<>();

	public void addObserver(TemperaturaObserver observer) {
		observers.add(observer);
	}
	
	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
		notifyObservers();
	}
	
	private void notifyObservers() {
		for (TemperaturaObserver o : observers) {
			o.temperaturaMudou(temperatura);
		}
	}
}

class Termometro implements TemperaturaObserver {
	protected String nome;
	
	public Termometro(String nome) {
		super();
		this.nome = nome;
	}

	public void imprimeTemperatura(double t) {
		System.out.println(nome + "[[[~~~ " + t + " ~~~]]]");
	}

	@Override
	public void temperaturaMudou(double t) {
		imprimeTemperatura(t);
	}
}

class TermometroFahrenheit extends Termometro {
	public TermometroFahrenheit(String nome) {
		super(nome);
	}

	public void imprimeTemperatura(double t) {
		System.out.println(nome + "[[[~~~ " + (t * 2) + " ~~~]]]");
	}
}

class ArCondicionado implements TemperaturaObserver {
	public void ligar() {
		System.out.println("ligado");
	}
	public void desligar() {
		System.out.println("desligado");
	}
	@Override
	public void temperaturaMudou(double t) {
		if (t < 25.0) {
			desligar();
		} else {
			ligar();
		}
	}
}