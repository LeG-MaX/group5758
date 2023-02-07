package Lessons.Lesson9.StringBuilder;

import java.util.Arrays;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder("Something data");

        System.out.println(stringBuilder);
        System.out.println(stringBuilder1);
        System.out.println("---");

        stringBuilder.append(new Integer(2));
        stringBuilder.append(";");
        stringBuilder.append(true);
        stringBuilder.append(Arrays.asList(1,2,3));

        System.out.println(stringBuilder);
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.reverse());

    }
}
