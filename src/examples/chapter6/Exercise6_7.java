package examples.chapter6;

import org.w3c.dom.ls.LSOutput;

class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(int x1, int y1) {
        int xDistance = x1 - x;
        int yDistance = y1 - y;

        return Math.sqrt(xDistance * xDistance + yDistance * yDistance);
    }
}

public class Exercise6_7 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);

        System.out.println(p.getDistance(2, 2));
    }
}
