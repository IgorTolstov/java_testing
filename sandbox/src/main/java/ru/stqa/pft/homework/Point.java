package ru.stqa.pft.homework;

public class Point {

    public double X;
    public double Y;

    public Point(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    public double distanceTo(Point p1) {

        return Math.sqrt((p1.X - X) * (p1.X - X) + (p1.Y - Y) * (p1.Y - Y));
    }

    public String toString() {

        return "(" + X + ", " + Y + ")";
    }

}


