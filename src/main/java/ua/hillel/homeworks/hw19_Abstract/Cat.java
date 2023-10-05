package ua.hillel.homeworks.hw19_Abstract;

public class Cat extends Animal {

    public  Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("I'm a Cat. My name is " + petName() + ". Mew");
    }
}