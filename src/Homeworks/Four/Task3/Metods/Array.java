package Homeworks.Four.Task3.Metods;

import java.util.Scanner;

public class Array {
    public int[] arrayZero() {
        System.out.println("input N - ");
        Scanner scanner = new Scanner(System.in);
        int sizeN = scanner.nextInt();
        int[] arrayZero = new int[sizeN];
        for (int i = 0; i < arrayZero.length; i++) {
            arrayZero[i] = 1+i;
        }
        return arrayZero;
    }

    public int[] arrayWithNMinusOne() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int size = N;
        int[] arrayN = new int[size];
        for (int i = 0; i < arrayN.length ; i++) {
            if (i != (size-1)) {
                arrayN[i] = 1+i;
            }
        }
        return arrayN;
    }
}
