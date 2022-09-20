package br.com.java.udemy.classes.metodos;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();
		
		
		var d2 = new Data(27,12,1989);

		
		System.out.println(d1.obterDataFormatada(d1.dia,d1.mes,d1.ano));
		System.out.println(d2.obterDataFormatada(d2.dia,d2.mes,d2.ano));
		
		System.out.println(d1.formatacaoData());
		System.out.println(d2.formatacaoData());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
	}
}
