package Homeworks.Three;

public class Task4 {

    public static void main(String[] args) {

        Boolean isWeekend = true;
        Boolean isRain = false;
        Boolean canWalk = isWeekend && !isRain;

        if (canWalk) {
            System.out.println(canWalk + " Идем гулять!");
        } else {
            System.out.println(canWalk + " Сидим дома!");
        }
    }
    
}
