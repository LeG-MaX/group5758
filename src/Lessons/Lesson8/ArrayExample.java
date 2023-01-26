package Lessons.Lesson8;

import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {
        InputArray inputArray = new InputArray();
        PrintArray printArray = new PrintArray();
        ArrayOperationsExample arrayOperationsExample = new ArrayOperationsExample();

        int[] workArray = inputArray.userInput();
        printArray.arrayPrint("Our working array: ", workArray);
        System.out.println("---");
        int sumOfArray = arrayOperationsExample.sumOfArrayElements(workArray);
        int minOfArray = arrayOperationsExample.minOfArrayElements(workArray);
        int maxOfArray = arrayOperationsExample.maxOfArrayElements(workArray);

        System.out.println("sum elements - "+sumOfArray);
        System.out.println("min element - "+minOfArray);
        System.out.println("max element - "+maxOfArray);
    }
}
