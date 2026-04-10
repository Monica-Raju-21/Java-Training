package Inheritance;

class Vehicle {
    String brand = "Ford";

    void honk() {
        System.out.println("Beep beep!");
    }
}

class Car extends Vehicle {
    int doorCount = 4;

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Doors: " + doorCount);
    }
}

public class InheritanceExample2 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.displayInfo();
        myCar.honk();
    }
}