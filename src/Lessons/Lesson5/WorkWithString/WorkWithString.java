package Lessons.Lesson5.WorkWithString;

public class WorkWithString {
    public static void main(String[] args) {

        String str1 = " ";
        String text = "Это текст для проверки работы методом типа String";
        String text1 = "";

        System.out.println(text);

        System.out.println(text.length());

        System.out.println(str1.isEmpty());
        System.out.println(str1.isBlank());

        System.out.println(text1.isEmpty());
        System.out.println(text1.isBlank());

        System.out.println(text.isEmpty());
    }
}
