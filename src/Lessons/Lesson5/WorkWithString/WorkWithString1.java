package Lessons.Lesson5.WorkWithString;

public class WorkWithString1 {

    public static void main(String[] args) {

        String str1 = " ";
        String text = "Это текст для проверки работы методом типа String";
        String text1 = "";

        char simbol = text.charAt(0);

        System.out.println(text.charAt(0));
        System.out.println(text.charAt(10));
        System.out.println(text.charAt(14));
        System.out.println(text.charAt(48));

        //выждает ошибку поскольку нумерация начинается с 0 а мы имеем всего 49 символов(с 0 до 48)
        //System.out.println(text.charAt(49));

        String substringText1 = text.substring(43);

        String substringText2 = text.substring(0, 18);

        System.out.println(substringText1);
        System.out.println(substringText2);

    }

}
