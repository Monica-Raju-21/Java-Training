package AccessModifiers;

class Roommate {
    String wifiPassword = "Password123"; // No modifier = Default
}

public class DefaultEx1 {
    public static void main(String[] args) {
        Roommate r = new Roommate();
        System.out.println("Connecting to WiFi using: " + r.wifiPassword);
    }
}