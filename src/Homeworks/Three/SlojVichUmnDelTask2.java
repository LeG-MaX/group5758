package Homeworks.Three;

public class SlojVichUmnDelTask2 {


    public static void main(String[] args) {

        double x = 25;
        double y = 5;
        Deystviya vse = new Deystviya();
        Double sloj = vse.sloj(x,y);
        System.out.println("slojenie - "+ sloj);
        Double vich = vse.vich(x,y);
        System.out.println("vichitanie - " + vich);
        Double umn = vse.umn(x,y);
        System.out.println("umnojeni - " + umn);
        Double del = vse.del(x,y);
        System.out.println("delenie - " + del);


    }
}
