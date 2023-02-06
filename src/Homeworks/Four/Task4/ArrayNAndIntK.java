package Homeworks.Four.Task4;

import java.util.Arrays;

public class ArrayNAndIntK {
    public static void main(String[] args) {

        MetodsForArrayN metodsForArrayN = new MetodsForArrayN();
        int size = metodsForArrayN.inputSizeN();
        System.out.println("---///---");
        int[] massiv = metodsForArrayN.arrayN(size);
        System.out.println("---");
        metodsForArrayN.pushToArray(massiv);
        System.out.println(Arrays.toString(massiv));
        metodsForArrayN.sravnenieNumbers(massiv);
    }
}









      /*  Дан массив из N целых чисел и целое число K , найдите количество пар элементов в массиве, сумма которых равна K.
                Пример 1:
        Вход:
        N = 4, K = 6
        arr[] = {1, 5, 7, 1}
        Вывод: 2 пары чисел
        Объяснение:
        arr[0] + arr[1] = 1 + 5 = 6
        arr[1] + arr[3] = 5 + 1 = 6.
        Пример 2:
        Вход:
        N = 4, К = 2
        arr[] = {1, 1, 1, 1}
        Выход: 6 пар чисел
    1.получить размер массива +
    2.получить число К +
    3.создание массива нужного размера +
    4.заполнить массив +
    5.найти колличество пар элементов массива равная K +
    6.вывести пары +
       */
