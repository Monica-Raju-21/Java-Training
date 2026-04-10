package Abstraction;

abstract class Car{
    abstract void startEngine();
    void turnOnLights(){
        System.out.println("Lights are on now");
    }
}
class Tesla extends Car{
    @Override
    void startEngine(){
        System.out.println("Silent Start...Electronic System active");
    }
}
public class AbstractionExample2 {
    public static void main(String[] args){
        Car myCar=new Tesla();
        myCar.startEngine();
    }
}

