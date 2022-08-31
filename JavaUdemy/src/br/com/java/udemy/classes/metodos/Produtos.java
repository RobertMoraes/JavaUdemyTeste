package br.com.java.udemy.classes.metodos;

public class Produtos {
	String nome;
	double preco;
	double desconto;
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	double precoComDesconto(double descontoGerente) {
		return preco * (1 - desconto + descontoGerente);
	}
}
