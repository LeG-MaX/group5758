package Homeworks.Three;

import java.util.Scanner;

public class Konverter {




    public double Val () {
        System.out.println("введите колличество валюты ");
        Scanner scanner2 = new Scanner(System.in);
        double val = scanner2.nextDouble();
        return val;
    }
    public double Kurs (){

        System.out.println("какой текущий курс ");
        Scanner scanner = new Scanner(System.in);
        double kurs = scanner.nextDouble();
        return kurs;
    }
    public double Kurs2 (){
        System.out.println("какой курс валюты ");
        Scanner scanner3 = new Scanner(System.in);
        double kurs2 = scanner3.nextDouble();
        return kurs2;
    }
}
