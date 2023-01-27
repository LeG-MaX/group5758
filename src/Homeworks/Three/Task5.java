package Homeworks.Three;

public class Task5 {
    public static void main(String[] args) {
        boolean isEdekaOpen = true;
        boolean isReweOpen = false;
        boolean canBay;

        if (isEdekaOpen || isReweOpen) {
            canBay = true;
            System.out.println("Я могу купить еду, это " + canBay);
        } else {
            canBay = false;
            System.out.println("Я не могу купить еду, это " + canBay);
        }
    }
}
