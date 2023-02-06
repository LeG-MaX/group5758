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
        int n = scanner.nextInt();
        int size = n-1;
        int[] arrayN = new int[size];
        for (int i = 0; i < (arrayN.length) ; i++) {
            if (i < (size-1)) {
                arrayN[i] = 1+i;
            } else {
                arrayN[i] = 2+i;
            }
        }
        return arrayN;
    }

public void missingNumber(int[] arrayN){
    int n = arrayN.length -1;
    int N = arrayN[n];
    int summaAllElements = N*(N+1)/2;

    int summaWhithoutOneElement =0;
    for (int i = 0; i < arrayN.length; i++) {
        summaWhithoutOneElement = summaWhithoutOneElement +arrayN[i];
    }
    int missingElemet = summaAllElements - summaWhithoutOneElement;
}


}
