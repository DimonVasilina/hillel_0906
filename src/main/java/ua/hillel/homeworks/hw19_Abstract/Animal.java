package ua.hillel.homeworks.hw19_Abstract;

public abstract class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;

    }

    public String petName() {
        return name;
    }

    public abstract void sound();

}