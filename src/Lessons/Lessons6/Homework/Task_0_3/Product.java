package Lessons.Lessons6.Homework.Task_0_3;

import java.util.Scanner;

public class Product {

    String kandis;
    double regularPrice;
    double discount;
    double priceDiscount;

    public Product() {
        System.out.println("What kandis do you search? ");
        Scanner scanner = new Scanner(System.in);
        this.kandis = scanner.nextLine();
        System.out.println("insert price - ");
        Scanner scanner1 = new Scanner(System.in);
        this.regularPrice = scanner1.nextDouble();
        System.out.println("discount? ");
        Scanner scanner2 = new Scanner(System.in);
        this.discount = scanner2.nextDouble();
        System.out.println("Kandis "+kandis+" in price - "+regularPrice+" have discont at now - "+discount+"%");
        priceDiscount = regularPrice-(regularPrice*discount/100);
        System.out.println("Price with discount is - "+ priceDiscount);
    }
}
