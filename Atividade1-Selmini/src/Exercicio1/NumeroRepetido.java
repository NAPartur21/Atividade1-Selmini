package Exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class NumeroRepetido {
    public static int encontraNumeroRepetido(ArrayList<Integer> array) {
        int n = array.size();
        boolean[] visto = new boolean[n];

        for (int i = 0; i < n; i++) {
            int numero = array.get(i);
            if (visto[numero]) {
                return numero;
            }
            visto[numero] = true;
        }
        return -1; 
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println();
            System.out.print("  Digite a quantidade de numeros na array --> ");
            int n = scanner.nextInt();

            if (n < 2) {
                System.out.println("    O tamanho da array deve ser maior que 1 ");
                return;
            }

            ArrayList<Integer> array = new ArrayList<>();
            System.out.println();
            System.out.println("    Digite os numeros da array (entre 1 e " + (n - 1) + ") -->");
            for (int i = 0; i < n; i++) {
                int valor = scanner.nextInt();
                if (valor < 1 || valor >= n) {
                    System.out.println("    Os elementos devem estar entre 1 e " + (n - 1) );
                    return;
                }
                array.add(valor);
            }
            System.out.println();
            int numeroRepetido = encontraNumeroRepetido(array);
            if (numeroRepetido != -1) {
                System.out.println("    Número repetido = " + numeroRepetido);
            }
            scanner.close();
        }
    }
}
