package Lessons.Lesson7.LessonCode;

import java.util.Scanner;

public class LoopWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x;
        int y;
        boolean condition =true;
        while (condition){
            System.out.println("Please enter two numbers. If you will enter first number equal 100 - exit");

            System.out.println("Please enter first number ");
            x = scanner.nextInt();
            System.out.println("Please enter second number ");
            y = scanner.nextInt();

            System.out.println("Add result is - " + (x+y));

            if ((x+y)>100){
                condition = false;
            }
        }
        System.out.println("Finish loop while");
    }
}
