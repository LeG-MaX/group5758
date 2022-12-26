package Lessons.Lesson2;

public class Multitable {

    public static void main(String[] args) {

        Input userInput = new Input();

        System.out.println("Please enter integer number - ");
        int intInput = userInput.inputInt();
        System.out.println("Your number is " + intInput);

        System.out.println("Please enter double number - ");
        double doubleInput = userInput.inputDouble();
        System.out.println("Your number is " + doubleInput);

        System.out.println("Please enter your string - ");
        String stringInput = userInput.inputString();
        System.out.println("Your string is " + stringInput);

    }
}
