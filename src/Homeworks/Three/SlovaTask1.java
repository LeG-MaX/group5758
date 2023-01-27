package Homeworks.Three;

import java.util.Scanner;

public class SlovaTask1 {
    public static void main(String[] args) {
        System.out.println("введите 2 слова");
        System.out.println("1 слово");
        Scanner scanner1 = new Scanner(System.in);
        String pervoeSlovo = scanner1.nextLine();
        System.out.println(pervoeSlovo.length());
        int x = pervoeSlovo.length();
        System.out.println("2 слово");
        Scanner scanner2 = new Scanner(System.in);
        String vtoroeSlovo = scanner2.nextLine();
        System.out.println(vtoroeSlovo.length());
        int y = vtoroeSlovo.length();
        System.out.println(pervoeSlovo.substring(0, x/2) + " / " + vtoroeSlovo.substring(y/2, y));

    }
}
