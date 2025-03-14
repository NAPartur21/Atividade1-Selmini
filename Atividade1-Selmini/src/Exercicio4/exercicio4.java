package Exercicio4;
import java.util.ArrayList;

public class exercicio4 {
    public static void main(String[] args) {
        ArrayList<Triangulo> lista = new ArrayList<>();
        
        System.out.println();
        lista.add(new Triangulo(3, 4, 5));
        System.out.println();
        lista.add(new Triangulo(5, 12, 13));
        System.out.println();
        lista.add(new Triangulo(7, 24, 25));
        System.out.println();
        
        for (Triangulo t : lista) {
            t.mostrar();
        }
    }
}
