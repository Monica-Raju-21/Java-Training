package Polymorphism;

class Shape {
    void draw() {
        System.out.println("Drawing a generic shape...");
    }
}


class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle with a radius.");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Square with four sides.");
    }
}

public class PolymorphismExample1 {
    public static void main(String[] args) {
        Shape myShape = new Circle();
        myShape.draw();
        myShape = new Square();
        myShape.draw();
    }
}