package Homeworks.Three;

public class ObmenTask3 {
    public static void main(String[] args) {
        Konverter konverter = new Konverter();
        System.out.println("это будет "+ konverter.Val()/konverter.Kurs() + " evro");
        System.out.println("это будет "+ konverter.Val()/konverter.Kurs2() + " dollar");
    }
}
