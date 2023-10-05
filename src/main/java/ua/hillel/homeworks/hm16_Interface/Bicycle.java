package ua.hillel.homeworks.hm16_Interface;

public class Bicycle implements Vehicle{
    private String brand;
    private String model;
    private int pedals;
    private int year;

    public Bicycle(String brand, String model, int year, int pedals){

        this.brand = brand;
        this.model = model;
        this.year = year;
        this.pedals = pedals;
    }

    @Override
    public void start() {
        System.out.println("Поездка на велосипеде " + brand + " началась. У велосипеда " + pedals + " педали.");

    }

    @Override
    public void stop() {
        System.out.println("Поездка на велосипеде " + brand + " завершена.");
    }
}