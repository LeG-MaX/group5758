package Lessons.Lesson8;

public class ArrayExample {

    public static void main(String[] args) {
        InputArray inputArray = new InputArray();
        PrintArray printArray = new PrintArray();
        ArrayOperationsExample arrayOperationsExample = new ArrayOperationsExample();

//        int[] workArray = inputArray.userInput();
//        printArray.arrayPrint("Our working array: ", workArray);
//        System.out.println("---");
//        System.out.println(workArray[3]); //вызывает 4 элемент массива

        int[] workArray = inputArray.randomInput(50);
        System.out.println("Array size - " + workArray.length);
        System.out.println("------");
//      System.out.println(workArray);
//      System.out.println(workArray[0]);
        printArray.arrayPrint("Our working array:", workArray);

        int sumOfArray = arrayOperationsExample.sumOfArrayElements(workArray);
        int minOfArray = arrayOperationsExample.minOfArrayElements(workArray);
        int maxOfArray = arrayOperationsExample.maxOfArrayElements(workArray);

        System.out.println("sum elements - "+sumOfArray);
        System.out.println("min element - "+minOfArray);
        System.out.println("max element - "+maxOfArray);
    }
}
