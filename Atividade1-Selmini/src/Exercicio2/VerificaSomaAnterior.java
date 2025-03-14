package Exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class VerificaSomaAnterior {
    public static boolean verificaSomaAnterior(ArrayList<Integer> array) {
        int n = array.size();

        for (int i = 2; i < n; i++) {
            int atual = array.get(i);

            for (int j = 0; j < i; j++) {
                for (int k = j + 1; k < i; k++) {
                    if (atual == array.get(j) + array.get(k)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("  Digite o tamanho do array (n > ou = 3) --> ");
        int n = scanner.nextInt();

        if (n < 3) {
            System.out.println("    O tamanho da array deve ser no minino 3 ");
            return;
        }
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println();
        System.out.println("    Digite os numeros da array --> ");
        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }

        boolean existeSomaAnterior = verificaSomaAnterior(array);

        System.out.println();
        if (existeSomaAnterior) {
            System.out.println("    Existe um elemento que é a soma de dois anteriores ");
        } else {
            System.out.println("    Nenhum elemento é a soma de dois anteriores ");
        }

        scanner.close();
    }
}
