package Homeworks.Four.Task3;
/*
3) Дан массив размера N-1 , который должен содержать только целые числа в диапазоне от 1 до N . Каждое число представлено в одном экземпляре, кроме одного числа. Найдите недостающий элемент.
Пример 1:
Вход:
N = 5
А[] = {1,2,3,5}
Ответ: 4
Пример 2:
Вход:
N = 10
А[] = {6,1,2,8,3,4,7,10,5}
Ответ: 9
 */

import Homeworks.Four.Task3.Metods.Array;

import java.util.Arrays;
import java.util.Random;

public class ArrayN_1 {
    public static void main(String[] args) {
        Array array = new Array();
        int[] NMinusOdin = array.arrayWithNMinusOne();
        System.out.println(Arrays.toString(NMinusOdin));
  //      System.out.println(NMinusOdin.length);

        int n = NMinusOdin.length -1;
        int N = NMinusOdin[n];
        int summaAllElements = N*(N+1)/2;

        int summaWhithoutOneElement =0;
        for (int i = 0; i < NMinusOdin.length; i++) {
            summaWhithoutOneElement = summaWhithoutOneElement +NMinusOdin[i];
        }
        int missingElemet = summaAllElements - summaWhithoutOneElement;
        System.out.println("Пропущенное число - " + missingElemet);
        // вариает вызова метода из аррау
//
//        int missingElement = array.missingNumber(NMinusOdin[i]);





//        int missingElemet = summaAllElements - summaWhithoutOneElement;
//        for (int i = NMinusOdin.length; i >= 0 ; i--) {
//            if (((NMinusOdin[i] - 1) - NMinusOdin[i-1]) == 0) {
//                int missingElemet = NMinusOdin[i] - 1;
//        System.out.println("Пропущенное число - " + missingElement);
//
//            }
//        }
    }
}
