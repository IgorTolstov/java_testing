package ru.stqa.pft.homework;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by itolstov on 5/23/2017.
 */

public class PointTests {

    @Test
    public void test1() {

        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);

        Assert.assertEquals(p1.distanceTo(p2), 5.0);

    }

    @Test
    public void test2() {
        Point p1 = new Point(-3, 0.2);
        Point p2 = new Point(0, -3);

        Assert.assertEquals((int) p1.distanceTo(p2), 4);
    }
}
