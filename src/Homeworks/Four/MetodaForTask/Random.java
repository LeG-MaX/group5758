package Homeworks.Four.MetodaForTask;

import java.util.Arrays;
import java.util.Scanner;

public class Random {
    public int[] randomInput() {
        System.out.println("введите размер массива - ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] randomArray = new int[size];
        int x;

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 50 * i);

            for (x=randomArray[i]; x >= 1 && x <= 50; i++) {
                if (x >= 1 && x <= 50) {
                    System.out.println(randomArray[i]);
                    break;
                } else {
                    randomArray[i] = (int) (Math.random() * 50 * i);
                    x =randomArray[i];
                    i--;
                }

            }
        }
        return randomArray;
    }
}
