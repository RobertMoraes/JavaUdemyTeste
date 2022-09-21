package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		double[] notasAlunoA = new double[3];
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		String formata = Arrays.toString(notasAlunoA);
		
		System.out.println(formata);
		
		double media = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			media +=notasAlunoA[i];
			System.out.println(notasAlunoA[i]);
		}
		
		System.out.println(media /notasAlunoA.length);
		
		for (double d : notasAlunoA) {
			System.out.println(d);
		}
	}

}
