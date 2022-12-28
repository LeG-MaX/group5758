package Lessons.Lesson2;

public class CalculatorDemo {

    public static void main(String[]args){

        Calculator calculator = new Calculator();
        double parametr1 = 25.5;
        double parametr2 = 5.0;

        //-----v1-----
        double sumResult = calculator.sum(parametr1,parametr2);
        System.out.println("Sum result is - " + sumResult);

        double subResult = calculator.sub(parametr1,parametr2);
        System.out.println("Sub result is - " + subResult);

        double multiplResult = calculator.multiplication(parametr1,parametr2);
        System.out.println("Multiplication result is - " + multiplResult);

        double divResult = calculator.div(parametr1,parametr2);
        System.out.println("Division result is - " + divResult);

        System.out.println("---v2---");
        //---v2---

        calculator.print("Sum", "+ result - " + calculator.sum(parametr1,parametr2));
        calculator.print("Sub", "- result - " + calculator.sub(parametr1,parametr2));
        calculator.print("Multitiplicati", "* result is - " + calculator.multiplication(parametr1,parametr2));
        calculator.print("Divi", "/ result is - " + calculator.div(parametr1,parametr2));

        System.out.println("---v---");
        calculator.print("Mult xy +Sub 15 +Sum 0.3", "Result is - " + calculator.sum(calculator.sub(calculator.multiplication(parametr1,parametr2), 15), 0.3));

    }
}
