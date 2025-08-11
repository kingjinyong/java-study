package java.examples.chapter7;

public class Excercise7_20 {
    public static void main(String[] args) {
        Parent1 p = new Parent1();
        Child1 c = new Child1();

        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}


class Parent1 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child1 extends Parent {
    int x = 200;

    void method() {
        System.out.println("Child Method");
    }
}