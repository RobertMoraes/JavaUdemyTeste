package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println(conjunto.size());
		
		
		HashSet numeros = new HashSet();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		
		System.out.println(numeros);
		System.out.println(conjunto);
		
		conjunto.addAll(numeros);
		System.out.println(conjunto);
		
		conjunto.retainAll(numeros);
		System.out.println(conjunto);
	}

}
