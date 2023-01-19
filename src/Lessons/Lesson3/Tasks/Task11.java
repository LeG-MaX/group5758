package Lessons.Lesson3.Tasks;

import Lessons.Lesson5.Robot;

public class Task11 {

    public static void main(String[] args) {

        Robot robot1 = new Robot("Shelezyaka");
        robot1.speak("dzen dzen");
        robot1.hello();
        robot1.sayYuorName();

        Robot robot2 = new Robot("Skripyaka");
        robot2.speak("skrip skrip");
        robot2.hello();
        robot2.sayYuorName();

        Robot robot3 = new Robot("Zabivaka");
        robot3.speak("bah bah");
        robot3.hello();
        robot3.sayYuorName();

        Robot robot4 = new Robot("Pochinyaka");
        robot4.speak("chto pochinit?");
        robot4.hello();
        robot4.sayYuorName();

        Robot robot5 = new Robot("Grubiyaka");
        robot5.speak("da poshlo ono vse");
        robot5.hello();
        robot5.sayYuorName();



    }
}
