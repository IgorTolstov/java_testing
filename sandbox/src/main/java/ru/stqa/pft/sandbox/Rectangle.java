package ru.stqa.pft.sandbox;

/**
 * Created by SanchezKlauss on 5/18/2017.
 */
public class Rectangle {

    public double a;
    public double b;

    public Rectangle (double a, double b) {
        this.a = a;
        this.b = b;
    }

    public  double area() {
        return a * b;
    }
}
