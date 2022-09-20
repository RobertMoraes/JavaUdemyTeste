package br.com.java.udemy.classes.metodos;

public class Jantar {
	public static void main(String[] args) {
		Comida c1 = new Comida("Arroz", 0.300);
		Comida c2 = new Comida("Feijão", 0.250);
		
		Pessoa p1 = new Pessoa("Robert", 83.0);
		
		System.out.println(p1.apresentar());
		p1.comer(c1);
		
		System.out.println(p1.apresentar());
		p1.comer(c2);
		
		System.out.println(p1.apresentar());
	}
}
