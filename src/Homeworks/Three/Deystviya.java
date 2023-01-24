package Homeworks.Three;

public class Deystviya {

    public double sloj(double x, double y){

        double sloj = x+y;
        return sloj;
    }

    public double vich(double x, double y){

        double vich = x-y;
        return vich;
    }

    public double umn(double x, double y){

        double umn = x*y;
        return umn;
    }

    public double del(double x, double y){

        double del = x/y;
        return del;
    }
    public void print (String task, String message){

        System.out.println("Our task is - " + task);
        System.out.println(message);
        System.out.println("--------");
    }
}
