package com.java.lambda;

@FunctionalInterface
interface Shape{
    void draw();
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle..........");
    }
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle..........");
    }
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Square.............");
    }
}




public class LambdaDemo {
    public static void main(String[] args) {

    Shape circle =   ()-> System.out.println("Circle..........");
    // circle.draw();
    print(circle);
    Shape square = () -> System.out.println("Square.............");
    //square.draw();
    print(square);

    Shape rectangle = () -> System.out.println("Rectangle.........");
    // rectangle.draw();
    print(rectangle);

    System.out.println(".......... Single Line Lambda ............");

    print(() -> System.out.println("Circle................"));
    print(() -> System.out.println("Rectangle............."));
    print(() -> System.out.println("Square................."));


    }

 public static void print(Shape shape){
     shape.draw();
 }
}
