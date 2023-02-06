package Homeworks.Four.Task4;

import java.util.Scanner;

public class MetodsForArrayN {
    public int inputSizeN(){
        System.out.println("Input siza array N -");
        Scanner scaner =new Scanner(System.in);
        int N = scaner.nextInt();
        return N;
    }
    public int inputNumberK(){
        System.out.println("Input number K -");
        Scanner scaner = new Scanner(System.in);
        int K = scaner.nextInt();
        return K;
    }
    public int[] arrayN (int arraySize){
        return new int[arraySize];
    }
    public  void pushToArray(int[] arrayN) {
        for (int i = 0; i < arrayN.length; i++) {
            arrayN[i] = (int) (Math.random() * 10);
        }
    }
    public void sravnenieNumbers(int[] arrayN){
        int otvet = 0;
        int K = inputNumberK();
        for (int i =0; i < arrayN.length-1; i++){
            for (int j=i+1; j < arrayN.length; j++){
                int proverka = arrayN[i]+arrayN[j];
                if (proverka == K) {
                    otvet = otvet + 1;
                }
            }
        }
        System.out.println("Ответ - " + otvet);
    }
}
