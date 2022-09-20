package br.com.java.udemy.classes.metodos;

import java.text.DecimalFormat;

public class ProdutosTestes {

	public static void main(String[] args) {
		Produtos p1 = new Produtos("Notebook Dell G3-15",5362.32,0.25);
		
		Produtos p2 = new Produtos();
		p2.nome = "Notebook LeNovo Tinkpad 15\"";
		p2.preco = 6835.45;
		
		Produtos.desconto =0.50;
				
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("Preço final 01 ::: R$ " + df.format(precoFinal1));
		System.out.println("Preço final 02 ::: R$ " + df.format(precoFinal2));
		
		
		
		double mediaCarrinho = (precoFinal1 + precoFinal2)/2;
		
		System.out.println("Média do carrinho ::: R$ " + df.format(mediaCarrinho));
		
		
	}

}
