package Lessons.Lesson5;

public class RobotDemo {

    public static void main(String[] args) {
        Robot robotPetya = new Robot();
        //не желательно
        robotPetya.robotName = "Petya";
        robotPetya.model = 25;
        robotPetya.isPainter = true;
        // 2 вариант


        robotPetya.hello();
        robotPetya.greetings();

        Robot robotSiri = new Robot("Siri", 5, false);
        robotSiri.greetings();
        robotSiri.model = 7;
        robotSiri.greetings();

        robotPetya.speak("I am very glad to see you!");
        robotSiri.speak("Me too!");
        robotPetya.speak("I'm to tired");
        //в данном варианте будет ошибка потому что id не инициализировано(не присвоено никакого значения)
        //System.out.println(robotPetya.id);
        //System.out.println(robotPetya.id.isEmpty());
    }
}
