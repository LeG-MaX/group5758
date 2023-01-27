package Lessons.Lesson6.Homework.Task_0_2;

import java.util.Scanner;

public class Circle {

    double radius;

    public Circle() {
        System.out.println("Insert radius r= ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        System.out.println("P of circle = "+Math.PI*radius*radius);
    }
}
