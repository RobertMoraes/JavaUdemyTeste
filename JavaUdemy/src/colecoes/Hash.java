package colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Ususario> ususarios = new HashSet<>();

        ususarios.add(new Ususario("Pedro"));
        ususarios.add(new Ususario("Ana"));
        ususarios.add(new Ususario("Paulo"));
        ususarios.add(new Ususario("Guilherme"));

        boolean resultado = ususarios.contains(new Ususario("Pedro"));
        System.out.println(resultado);
    }
}
