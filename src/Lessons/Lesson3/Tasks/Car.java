package Lessons.Lesson3.Tasks;

public class Car {

    String model;

    String getModel() {
        return this.model;
    }

    Car(String newModel) {
        this.model = newModel;
    }



}

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }
}
