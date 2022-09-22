package arrays;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioArrayNotas {
	public static void main(String[] args) {
		int nrNotas = Integer.parseInt(JOptionPane.showInputDialog("Quantas notas quer informar?"));
		
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US);
		
		double soma = 0;
		
		double[] notas = new double[nrNotas];
				
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota " + (i+1)+": ");
			notas[i] = entrada.nextDouble();
		}
		
		for (double d : notas) {
			soma += d;
		}
		
		double media = soma / notas.length;
		String resultado = String.format("%.2f", media);
		System.out.printf("A média é ::: " + resultado
				);
		
		entrada.close();
	}
}
