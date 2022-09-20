package br.com.java.udemy.classes.metodos;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc(5.6);
//		a.pi = 10;
		System.out.println(a.area());
		

		System.out.println(AreaCirc.area(100));
		System.out.println(AreaCirc.area(AreaCirc.PI));
		System.out.println(Math.PI);
		
	}

}
