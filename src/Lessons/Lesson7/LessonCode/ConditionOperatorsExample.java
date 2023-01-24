package Lessons.Lesson7.LessonCode;

public class ConditionOperatorsExample {
    public static void main(String[] args) {
        ThreeNumbersCompare threeNumbersCompare = new ThreeNumbersCompare();

        double parameter1 = threeNumbersCompare.userInputNumbers("Please enter your first number ");
        double parameter2 = threeNumbersCompare.userInputNumbers("Please enter your second number ");
        double parameter3 = threeNumbersCompare.userInputNumbers("Please enter your third number ");

        double checkResult = threeNumbersCompare.compare(parameter1,parameter2,parameter3);

        threeNumbersCompare.printMsg("Maximum from your numbers is " + checkResult);

    }
}
