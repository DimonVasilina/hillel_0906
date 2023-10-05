package ua.hillel.homeworks.hw19_Abstract;


import java.util.ArrayList;
import java.util.List;

public class Practice_cat_dog {

    public static void main(String... args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog("Tuzik"));
        animals.add(new Cat("Vasya"));

        for (Animal animal : animals) {
            animal.sound();
            // expected: I'am a Doc. My name is Tuzik. Gav
            // expected: I'am a Cat. My name Vasya. Mew
        }
    }
}