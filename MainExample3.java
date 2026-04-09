abstract class Animal {
    abstract void makeSound();
    void breathe() {
        System.out.println("Animal is breathing...");
    }
}
// Concrete subclass
class Cat extends Animal {
    // implementation for an abstract method
    @Override
    void makeSound() {
        System.out.println("Cat Meow");
    }
}
public class MainExample3 {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        myCat.breathe();
        myCat.makeSound();
    }
}