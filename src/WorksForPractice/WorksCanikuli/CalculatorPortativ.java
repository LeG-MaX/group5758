package WorksForPractice.WorksCanikuli;

import Lessons.Lesson2.Calculator;

import java.util.Scanner;

public class CalculatorPortativ {

    public static void main(String[] args) {

        System.out.println("Enter number 1 - ");
        Scanner scanner1 = new Scanner(System.in);
        double inputDouble1 =scanner1.nextDouble();

        System.out.println("Enter number 2 - ");
        Scanner scanner2 = new Scanner(System.in);
        double inputDouble2 =scanner2.nextDouble();

        Calculator calculator = new Calculator();
        calculator.print("Sum", "+ result - " + calculator.sum(inputDouble1,inputDouble2));
        calculator.print("Sub", "- result - " + calculator.sub(inputDouble1,inputDouble2));
        calculator.print("Multitiplicati", "* result is - " + calculator.multiplication(inputDouble1,inputDouble2));
        calculator.print("Divi", "/ result is - " + calculator.div(inputDouble1,inputDouble2));

    }
}
