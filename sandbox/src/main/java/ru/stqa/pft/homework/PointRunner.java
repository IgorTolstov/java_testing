package ru.stqa.pft.homework;

public class PointRunner {


    public static void main(String[] args) {


        Point p1 = new Point(-3, 0.2);
        Point p2 = new Point(0, -3);

        System.out.println("The distance between points " + p1 + " and " + p2 + " is " + p2.distanceTo(p1));

        System.out.println("The distance between points " + p1 + " and " + p2 + " is " + distance(p1,p2));
    }

    public static double distance (Point p1, Point p2) {
        return Math.sqrt((p1.X - p2.X) * (p1.X - p2.X) + (p1.Y - p2.Y) * (p1.Y - p2.Y));
    }

}
