package examples.chapter7;


abstract class Shape {
    Point1 p;

    Shape() {
        this(new Point1(0, 0));
    }

    Shape(Point1 p) {
        this.p = p;
    }

    abstract double calcArea(); // 도형의 면적을 계산해서 바환하는 메서드

    Point1 getPosition() {
        return p;
    }

    void setPosition(Point1 p) {
        this.p = p;
    }
}

class Point1 {
    int x;
    int y;

    Point1() {
        this(0, 0);
    }

    Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[" + x + "," + y + "]";
    }
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    double calcArea() {
        return r * r * Math.PI;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calcArea() {
        return width * height;
    }

    public boolean isSquare() {
        return width == height;
    }
}

public class Excercise7_22 {

    static public double sumArea(Shape[] arr) {
        double totalArea = 0.0;
        for (int i = 0; i < arr.length; i++) {
            totalArea += arr[i].calcArea();
        }
        return totalArea;
    }

    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};

        System.out.println("면적의 합:" + sumArea(arr));
    }
}
