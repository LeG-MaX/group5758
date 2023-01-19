package Lessons.Lessons6.LessonCode.StaticType;

import Lessons.Lessons6.LessonCode.StaticType.Person;

public class PersonDemo {

    public static void main(String[] args) {

        Person persPetr = new Person();
        Person persOlga = new Person();

        persPetr.name = "Petr";
        persPetr.town = "Holliwood";

        System.out.println("===Petr==");
        System.out.println(persPetr.name);
        System.out.println(persPetr.town);

        persOlga.name = "Olga";
        persOlga.town = "Derevnya Kukuevo";

        System.out.println("===Olga==");
        System.out.println(persOlga.name);
        System.out.println(persOlga.town);
    }
}
