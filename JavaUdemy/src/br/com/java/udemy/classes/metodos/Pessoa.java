package br.com.java.udemy.classes.metodos;

public class Pessoa {
	String nome;
	double peso;
	
	public Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		if(comida !=null) {
			this.peso += comida.peso;
		}
	}
	
	String apresentar() {
		return "Olá eu me chamo " + nome + " e tenho " + peso + " Kgs.";
	}
	
}
