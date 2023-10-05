package ua.hillel.homeworks.hm16_Interface;

public class Car implements Vehicle{
    private String brand;
    private String model;
    private int doors;
    private int year;
    public Car (String brand, String model, int year, int doors){
        this.brand = brand;
        this.model = model;
        this.doors = doors;
        this.year = year;
    }
    @Override
    public void start() {
        System.out.println("Двигатель автомобиля " +brand+ " запущен. У авто " + doors +" двери!");
    }

    @Override
    public void stop() {
        System.out.println("Двигатель автомобиля "+ brand +" остановлен.");

    }
}