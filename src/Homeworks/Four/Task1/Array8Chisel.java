package Homeworks.Four.Task1;
//1 задание для массива из8 случайных чисел в интервале от 1 до 50!

import java.util.Arrays;

public class Array8Chisel {

    public static void main(String[] args) {

 //      Random random = new Random();
  //     int[] chisla = random.randomInput();
        int[] chisla = {11,23,32,43,33,17,14,44};
        System.out.println("---");
        System.out.println("Размер массива - " + chisla.length);
        System.out.println("наш массив"+ Arrays.toString(chisla));

        int[] dlaZamenyNa0 = chisla.clone();
        for (int i = 0; i < dlaZamenyNa0.length; i++) {
            if (i%2 == 0) {  //почему при остатке 0 и условии != 0 обнуляет четный элемент массива? и почему при остатке 0 и выполнении условия обнуляются не четные?
                dlaZamenyNa0[i] = 0;
            }
        }
        System.out.println("New array - " + Arrays.toString(dlaZamenyNa0));

    }
}
