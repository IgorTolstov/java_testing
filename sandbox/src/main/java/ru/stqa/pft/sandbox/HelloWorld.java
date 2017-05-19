package ru.stqa.pft.sandbox;

public class HelloWorld {

    public static void main(String[] args) {
        String somebody = "Igor";
        hello(somebody);
        Square s = new Square(5.0);
        Rectangle r = new Rectangle(5.0, 6.0);
        System.out.println("The area of a square with a side " + s.l + " = " +  s.area());
        System.out.println("The area of a rectangle with sides " + r.a + " and " + r.b + " = " + r.area());

    }


    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody);
    }




}