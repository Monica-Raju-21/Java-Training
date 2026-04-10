package Abstraction;

abstract class CoffeeMachine {
    abstract void brew();


    void boilWater() {
        System.out.println("Boiling water at 90°C...");
    }
}

class EspressoMachine extends CoffeeMachine {
    @Override
    void brew() {
        boilWater();
        System.out.println("Dripping strong espresso...");
    }
}

public class AbstractionExample1 {
    public static void main(String[] args) {
        CoffeeMachine myMachine = new EspressoMachine();
        myMachine.brew();
    }
}