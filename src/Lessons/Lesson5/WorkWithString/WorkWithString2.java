package Lessons.Lesson5.WorkWithString;

public class WorkWithString2 {

    public static void main(String[] args) {

        String text = "Это текст для проверки работы методом типа String";
        System.out.println("Our work text -> " + text);

        String textString1 = "рабо";

        boolean resultContains = text.contains(textString1);
        System.out.println("Contains? " + resultContains);
        System.out.println("Contains? " + text.contains("Pert"));

        String textAfterUpperCase = text.toUpperCase();
        System.out.println(textAfterUpperCase);

        String textAfterLowerCase = text.toLowerCase();
        System.out.println(textAfterLowerCase);


        System.out.println("---");
        text = text.trim();
        System.out.println(text);

        System.out.println(text.indexOf("метод"));

        System.out.println(text.replace("о","а"));

        String substringText1 = text.substring(text.indexOf("метод"));
        System.out.println(substringText1);



    }

}
