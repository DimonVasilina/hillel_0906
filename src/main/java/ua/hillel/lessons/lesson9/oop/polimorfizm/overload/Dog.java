package ua.hillel.lessons.lesson9.oop.polimorfizm.overload;

public class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Gav");
    }

    public void aboutDog() {
      sayAnimalName("Rex");
      sound();
    }
}
