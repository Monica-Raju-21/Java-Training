package AccessModifiers;

class Father{
    protected String familyCar="VintageMustang";
}

class Son extends Father{
    void drive(){
        System.out.println("Son is driving the " + familyCar);
    }
}
public class ProtectedEx1 {
    public static void main(String[] args) {
        Son s=new Son();
        s.drive();
    }
}
