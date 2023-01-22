package Lessons.Lessons6.LessonCode.ConditionOperators;

import java.util.Scanner;

public class ConditionOperator {

    public static void main(String[] args) {

        int x = -150;
        System.out.println(x);

        if (x > 0) {
            System.out.println("x = " + x + "and x > 0");
        } else if (x<0){
            System.out.println("x = " + x + "and x > 0");
        } else {
            System.out.println("x = 0!!!");
        }

        int y;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 'y' value -");
        y = scanner.nextInt();


        if (y>0) {
            System.out.println("y = " + y +" and y > 0" );
        } else if (y<0){
            System.out.println("y = " + y +" and y < 0" );
        } else {
            System.out.println("y = 0!!!!" );
        }

    }
}
