package Abstraction;

abstract class RemoteControl{
    abstract void pressPowerButton();
    void showBatteryLevel(){
        System.out.println("Battery is at 80%");
    }
}

class SonyRemote extends RemoteControl{
    @Override
    void pressPowerButton(){
        System.out.println("Sending Sony IR Signal: Code 901098");
        System.out.println("TV Signal is now ON");
    }
}

public class AbstractionExample3 {
    public static void main(String[] args){
        RemoteControl myRemote=new SonyRemote();
        myRemote.pressPowerButton();
    }
}
