package Lessons.Lesson10.homework;
//создание массива
public class ArrayUtil {
    public int[] createArray (int arraSize){
        return new int[arraSize];
    }
//заполнение массива
    public void fillArrayByRandomElements(int[] workingArray, int arrayRange){
        for (int i=0; i < workingArray.length; i++){
            workingArray[i] = (int) (Math.random()*arrayRange);
        }
    }
//ограничение чисел массива в строке до 10
    public void printArray(String message, int[] workingArray){

        System.out.println(message);
        int count =0;
        for (int i = 0; i < workingArray.length; i++) {
            System.out.print(workingArray[i]+", ");
            count++;
            if (count % 10==0) {
                System.out.println();
            }

        }
        System.out.println();
    }

    public int[] changeOriginalArray(int[] workingArray){

        int[] newArray = new int[workingArray.length];
        for (int i = 0; i < workingArray.length; i++) {
            if(i%2 != 0){
                newArray[i]=0;
            } else {
                newArray[i] = workingArray[i];
            }

        }
        return newArray;
    }

    public int[] changeOriginalNumbersArray(int[] workingArray){

        int[] newArray1 = new int[workingArray.length];
        for (int i = 0; i < workingArray.length; i++) {
            if(workingArray[i]%2 != 0){
                newArray1[i]=0;
            } else {
                newArray1[i] = workingArray[i];
            }

        }
        return newArray1;
    }
}
