package Homeworks.Four.Task2;

//2 задание для массива из случайных чисел в интервале от 10 до 99

import Homeworks.Four.MetodaForTask.Random;

import java.util.Arrays;

public class Array5Chisel {
    public static void main(String[] args) {

        int j = 0;
//      int[] chisla = {11,77,33,21,55};
        int size = 5;
        int rangeMax =99;
        int rangeMin = 10;

        Random random = new Random();
        int[] chisla = random.createArray(size);
        System.out.println("наш массив:");
        random.randomArrayMinMax(chisla, rangeMax, rangeMin);
        System.out.println();
        System.out.println("---");
        System.out.println("Размер массива - " + chisla.length);
        for (int i = 1; i < 5; i++) {
            if (chisla[i]>chisla[i - 1]){
            } else {
                System.out.println("number "+chisla[i-1] +" are bigger than next one!");
                j=j+1;
                break;
            }
        }
        if (j>0) {
            System.out.println("массив не строго возростающий");
        } else {
            System.out.println("массив строго возрастающий");
        }
    }







//
//        System.out.println(Arrays.toString(chisla));
//        for (int i = 1; i < 5; i++) {
//            if (chisla[i]>chisla[i - 1]){
//                System.out.println("ok");
//            } else {
//                System.out.println("number "+chisla[i-1] +" are bigger than next one!");
//                j=j+1;
//            }
//        }
//        if (j>0) {  //почему если поставить != то условие выполняется???
//            System.out.println("массив не строго возростающий");
//        } else {
//            System.out.println("массив строго возрастающий");
//        }
//    }
}
