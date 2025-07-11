package examples.chapter6;

// 두 점 (x, y)와 (x1, y1)간의 거리를 구한다.
public class Exercise6_6 {

    static double getDistance(int x, int y, int x1, int y1) {
        int xDistance = x1 - x;
        int yDistance = y1 - y;

        return Math.sqrt(xDistance * xDistance + yDistance * yDistance);
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }
}
