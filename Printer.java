//Access Modifiers
//Public
public class Printer {
    public static void main(String[] args) {
        Printer1 myPrinter = new Printer1();
        myPrinter.print();
    }
}

class Printer1 {
    void print() {
        System.out.println("Printing...");
    }
}