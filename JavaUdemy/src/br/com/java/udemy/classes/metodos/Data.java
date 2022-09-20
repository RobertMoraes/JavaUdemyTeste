package br.com.java.udemy.classes.metodos;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
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
