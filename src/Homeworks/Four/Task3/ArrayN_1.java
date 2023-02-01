package Homeworks.Four.Task3;

import Homeworks.Four.Task3.Metods.Array;

import java.util.Arrays;

public class ArrayN_1 {
    public static void main(String[] args) {
        Array array = new Array();
        int[] NMinusOdin = array.arrayWithNMinusOne();
        System.out.println(Arrays.toString(NMinusOdin)); //почему при задании последовательного массива
        // от 1 и выводе массива на экран массив включает 0?
        System.out.println(NMinusOdin.length);

    }
}
