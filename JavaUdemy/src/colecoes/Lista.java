package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Ususario> lista = new ArrayList<>();

        lista.add(new Ususario("Robert Moraes"));
        lista.add(new Ususario("Bruna Moraes"));

        for (Ususario u : lista) {
            // System.out.println(u.nome);
            System.out.println(u);
        }

    }
}
