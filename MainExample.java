//Objects
class Dog {
    String name;
    void bark() {
        System.out.println(name + " says Woof!");
    }
}

class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Max";
        myDog.bark();
    }
}

//Inheritance
class Vehicle {
    void start() {
        System.out.println("Vehicle is Starting");
    }
    void stop() {
        System.out.println("Vehicle is stopping");
    }
}

class Car extends Vehicle {
    // Fixed: 'void' must be lowercase
    void honk() {
        System.out.println("Car is honking");
    }
}

public class MainExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.stop();
        myCar.honk();
    }
}

