package Lessons.Lesson3.Tasks;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        String name = "Maxim";
        System.out.println(name + "?");
        String podtverjdenie = new String("yes");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println(podtverjdenie==scanner1);

        System.out.println("---");

        //конкатенация
        System.out.println("Hi " + name + "!");
        System.out.println("---");

        //Считывание строк с консоли
        System.out.println("What is yuor name?");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println("Hello " + inputString);
        System.out.println("---");

    }
}
