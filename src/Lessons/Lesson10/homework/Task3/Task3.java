package Lessons.Lesson10.homework.Task3;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,9,10,0};
        int[] array2 ={1,2,3,4,5,6,7,8,9,10};

        int n = array.length;
        int summaAllElements = n*(n+1)/2;

        int summaWhithoutOneElement =0;
        for (int i = 0; i < array.length; i++) {
            summaWhithoutOneElement = summaWhithoutOneElement +array[i];
        }

        int missingElemet = summaAllElements - summaWhithoutOneElement;


    }
}
