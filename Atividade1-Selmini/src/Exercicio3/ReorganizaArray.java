package Exercicio3;

import java.util.Scanner;

public class ReorganizaArray {
    public static void reorganizaArray(int[] array, int k) {
        int i = 0;
        int j = 0;

        while (j < array.length) {
            if (array[j] <= k) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }
            j++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("  Digite a quantiade de numeros da array --> ");
        int n = scanner.nextInt();

        System.out.println();

        if (n < 1) {
            System.out.println("    O tamanho da array deve ser pelo menos 1 ");
            return;
        }

        int[] array = new int[n];

        System.out.println("    Digite os numeros da array --> ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println();

        System.out.print("  Digite o valor de k --> ");
        int k = scanner.nextInt();

        reorganizaArray(array, k);

        System.out.println();
        
        System.out.print(" Array reorganizado --> ");
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
        scanner.close();
    }
}
