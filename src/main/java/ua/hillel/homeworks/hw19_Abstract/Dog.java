package ua.hillel.homeworks.hw19_Abstract;


public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("I'm a Dog. My name is " + petName() + ". Gav");
    }
}