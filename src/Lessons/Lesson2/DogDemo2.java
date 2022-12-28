package Lessons.Lesson2;

public class DogDemo2 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Input userInput = new Input();
        dog.name = userInput.inputString();

        Dog dog2 = new Dog();
        Input userInput1 = new Input();
        dog2.name = userInput1.inputString();

        System.out.println("My first dog name " + dog.name);
        System.out.println("My second dog name " + dog2.name);


    }

}
