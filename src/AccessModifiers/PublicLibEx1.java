package AccessModifiers;

// This class is Public, so it can be seen from any package
public class PublicLibEx1 {

    // This variable is Public, so any class that can see "Library" can see this
    public String openingHours = "9 AM - 9 PM";

    public static void main(String[] args) {

        PublicLibEx1 lib = new PublicLibEx1();


        System.out.println("The library is open: " + lib.openingHours);
    }
}