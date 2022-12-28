package WorksForPractice.WorksCanikuli;

import java.util.Scanner;

public class Predstavsya {

    public static void main(String[] args) {

        System.out.println("What is yuor name?");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println("Hello " + inputString);

        System.out.println("can I ask againe");

        //-------правда - лож-------

        System.out.println("What is yuor age?");
        Scanner scanner2 = new Scanner(System.in);
        int inputInteger = scanner2.nextInt();
        System.out.println("I'm under at " + inputInteger + " age without one day");

        //-------лож-------

        System.out.println("I live the first day and I am interested in everything :(");

    }
}
