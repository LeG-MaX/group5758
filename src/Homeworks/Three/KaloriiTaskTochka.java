package Homeworks.Three;

public class KaloriiTaskTochka {
    public static void main(String[] args) {
        int d1pizza = 24;
        int d2pizza = 28;
        int kaloriiV1cm = 40;

        double kaloriiV1pizza = (Math.PI*(d1pizza/2)*(d1pizza/2))*kaloriiV1cm;
 //       System.out.println(kaloriiV1pizza);
        double kaloriiV2pizza = (Math.PI*(d2pizza/2)*(d2pizza/2))*kaloriiV1cm;
//        System.out.println(kaloriiV2pizza);
        double lishnee = kaloriiV2pizza - kaloriiV1pizza;
        System.out.println("лишних калорий - " + lishnee);
    }
}
