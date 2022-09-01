package br.com.java.udemy.classes.metodos;

public class Produtos {
	String nome;
	double preco;
	double desconto;
	
	Produtos(){	}
	
	Produtos(String nomeInicial, double precoInicial, double descontoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	double precoComDesconto(double descontoGerente) {
		return preco * (1 - desconto + descontoGerente);
	}
}
