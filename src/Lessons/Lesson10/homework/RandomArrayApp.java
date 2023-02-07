package Lessons.Lesson10.homework;

public class RandomArrayApp {
    public static void main(String[] args) {
        /*
        1.получить размер массива
        2юполучить диапазон
        3.создать массив нужного размера
        4. заполнить массив случайными числами из заданного диапазона
        5.вывести информацию пользователю
         */
//        UserInterface ui =new UserInterface();
//        boolean checkInput =true;
//
//        while (checkInput) {
//            int arraySize = ui.userIntInput("please enter number of your array elements - ");
//            if ((arraySize>0)&&(arraySize<=8)) {
//            checkInput = false;
//            } else {
//                System.out.println("wrong aary size number!");
//            }
//        }
//        checkInput =true;
//
//        while (checkInput) {
//            int arraySize = ui.userIntInput("please enter array elements max value - ");
//            if ((arraySize>0)&&(arraySize<=50)) {
//                checkInput = false;
//            } else {
//                System.out.println("wrong array size number!");
//            }
//        }
        ArrayUtil au = new ArrayUtil();

        int arraySize = 8;
        int arrayRange = 50;
        int[] workingArray = au.createArray(arraySize);
        au.fillArrayByRandomElements(workingArray,arrayRange);
        au.printArray("printing array with random data",workingArray);

        int[] arrayAfterChenge =au.changeOriginalArray(workingArray);
        au.printArray("array after change data - ",arrayAfterChenge);

        int[] arrayAfterChengeNumbers =au.changeOriginalNumbersArray(workingArray);
        au.printArray("array after change data - ",arrayAfterChengeNumbers);

    }
}
