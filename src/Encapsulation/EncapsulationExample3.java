package Encapsulation;

class Laptop {
    private int batteryLevel = 50; // Hidden

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void charge(int amount) {
        if (batteryLevel + amount <= 100) {
            batteryLevel += amount;
        } else {
            batteryLevel = 100; // Cap it at 100%
        }
        System.out.println("Battery now at: " + batteryLevel + "%");
    }
}

public class EncapsulationExample3 {
    public static void main(String[] args) {
        Laptop myMac = new Laptop();
        myMac.charge(30); // Controlled access
    }
}