package Encapsulation;

class SocialProfile {
    private String username;
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String newName) {
        if (newName.length() > 3) {
            this.username = newName;
        } else {
            System.out.println("Error: Username too short!");
        }
    }
}

public class EncapsulationExample1 {
    public static void main(String[] args) {
        SocialProfile user = new SocialProfile();
        user.setUsername("JavaLearner"); // Setting data safely
        System.out.println("User is: " + user.getUsername());
    }
}