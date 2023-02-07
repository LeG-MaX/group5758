package Lessons.Lesson11.arraySortAndSearch;

public class ArrayForEachExample {
    public static void main(String[] args) {
        String[] stringArray = {"white", "black", "grey"};
        for (int i =0; i < stringArray.length; i++){
            System.out.println(stringArray[i]);
        }
        //цикл for ich
        System.out.println("-------");
        for (String tempString  : stringArray) { //во временную переменную которая имеет значение равное значению массива и ...
            System.out.println(tempString);
        }
    }
}
