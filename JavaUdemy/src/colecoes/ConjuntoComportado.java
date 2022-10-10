package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

//		Set<String> lista = new HashSet<String>();
		Set<String> lista = new TreeSet<String>();
		lista.add("Teste");
		lista.add("Robert");
		lista.add("Moraes");
		
		
		for(String candidato: lista) {			
			System.out.println(candidato);
		}
		
	}

}
