package Lessons.Lesson7.LessonCode;

import java.util.Scanner;

public class ThreeNumbersCompare {

    public double userInputNumbers (String messege){
        double userInput = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(messege);
        userInput = scanner.nextDouble();
        return userInput;
    }
    public void  printMsg(String message){
        System.out.println("-----");
        System.out.println(message);
    }

    public double compare(double parametr1, double parametr2, double parametr3){
        double compareResult = 0;
        if((parametr1>=parametr2)&&(parametr1>=parametr3)) {
            compareResult = parametr1;
        } else if ((parametr2>=parametr1)&&(parametr2>=parametr3)){
            compareResult = parametr2;
        } else {
            compareResult = parametr3;
        }
        return compareResult;
    }
}
