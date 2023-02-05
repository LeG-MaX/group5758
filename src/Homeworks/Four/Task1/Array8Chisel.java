package Homeworks.Four.Task1;
//1 задание для массива из8 случайных чисел в интервале от 1 до 50!

import Homeworks.Four.MetodaForTask.Random;

import java.util.Arrays;

public class Array8Chisel {

    public static void main(String[] args) {
        //int[] chisla = {11,23,32,43,33,17,14,44};
        int size = 8;
        int range =50;

        Random random = new Random();
        int[] chisla = random.createArray(size);
        System.out.println("наш массив:");
        random.randomArray(chisla, range);
        System.out.println();
        System.out.println("---");
        System.out.println("Размер массива - " + chisla.length);


        int[] dlaZamenyNa0 = chisla.clone();
        for (int i = 0; i < dlaZamenyNa0.length; i++) {
            if (i%2 == 0) {
                dlaZamenyNa0[i] = 0;
            }
        }
        System.out.println("Новый массив - " + Arrays.toString(dlaZamenyNa0));
        System.out.println("наш изначальный массив"+ Arrays.toString(chisla));
    }
}
