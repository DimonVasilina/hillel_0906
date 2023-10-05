package ua.hillel.homeworks.hm16_Interface;

public class Main {



    public static void main(String[] args) {

        // Создание объектов и вызов методов для проверки

        Vehicle car1 = new Car("Toyota", "Camry", 2022, 4);
        car1.start();
        car1.stop();
        // expected: Двигатель автомобиля Toyota запущен. У авто 4 двери!
        // expected: Двигатель автомобиля Toyota остановлен.

        Vehicle bicycle = new Bicycle("Giant", "XTC", 2021, 2);
        bicycle.start();
        bicycle.stop();
        // expected: Поездка на велосипеде Giant началась. У велосипеда 2 педали.
        // expected: Поездка на велосипеде Giant завершена.
    }


}