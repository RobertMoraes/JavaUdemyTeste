package br.com.java.udemy.classes.metodos;

public class Data {
	int dia;
	int mes;
	int ano;
	
	String obterDataFormatada(int dia, int mes , int ano) {
		String dataDiaMesAno = "Dia:: "+dia+" Mês:: "+mes+" Ano:: "+ano; 
						
		return dataDiaMesAno;
	}
	
	String formatacaoData() {
		return String.format("%d/%d/%d", dia,mes,ano);
	}
	
	//NÃO É VIÁVEL
	void imprimirDataFormatada() {
		System.out.println(formatacaoData());
	}
}
