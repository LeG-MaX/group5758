package Homeworks.Three;

//Представим, что у нас есть устройство, в котором две колбы. Прибор работает корректно, если температура первой
// колбы выше 100 градусов, а температура второй колбы меньше 100 градусов. Вы должны написать метод, который
// проверяет это устройство. Ваша программа должна иметь переменные Temperature1 и Temperature2. В результате
// он выводит сообщение true или false.
public class Task6 {
    public static void main(String[] args) {
        int temp1 = 111;
        int temp2 = 77;
        if (temp1 <= 100){
            System.out.println("Температура в первой колбе слишком низкая для прибора!!!");
            System.out.println(false);

        }else if (temp2 >= 100){
            System.out.println("Температура во второй колбе слишком высокая для прибора!!!");
            System.out.println(false);
        } else {
            System.out.println(true);

        }
    }
}
