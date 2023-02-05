package com.functionInterface;


interface Shape{
    public void draw();

    @Override
    public String toString(); // Overridden from Object class.

    @Override
    public boolean equals(Object obj); // Overridden from Object class.
}


public class FunctionalTest {
    public static void main(String[] args) {
//        Shape rectangle = ()-> System.out.println("Rectangle");
//        //rectangle.draw();
//        print(rectangle);
//
//        Shape circle = () -> {
//            System.out.println("Circle");
//        };
//        //circle.draw();
//        print(circle);
//
//        Shape square = () -> System.out.println("Square");
//        //square.draw();
//        print(square);

        //Lambda expression as a method parameters.
        print(()-> System.out.println("Rectangle"));
        print(()-> System.out.println("Circle"));
        print(()-> System.out.println("Square"));


    }
    public static void print(Shape shape){

        shape.draw();
    }
}
