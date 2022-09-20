package br.com.java.udemy.classes.metodos;

public class Produtos {
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produtos(){	}
	
	Produtos(String nomeInicial, double precoInicial, double descontoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	double precoComDescontoEspecial() {
		return preco * (1 - desconto + 0.10);
	}
}
