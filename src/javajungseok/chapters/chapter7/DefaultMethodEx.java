package javajungseok.chapters.chapter7;

public class DefaultMethodEx {
    public static void main(String[] args) {
        Child3 c = new Child3();
        c.method1();
        c.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}

class Parent3 {
//    public void method2() {
//        System.out.println("method2() in Parent");
//    }
}

class Child3 extends Parent3 implements MyInterface, MyInterface2 {
    public void method1() {
        System.out.println("method1() in Child");
    }
}

interface MyInterface {
    default void method1() {
        System.out.println("method1() in MyInterface");
    }

    default void method2() {
        System.out.println("method2() in MyInterface");
        privateMetod();
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface");
        privateStaticMetod();
    }

    private void privateMetod() {
        System.out.println("privateMetod() in MyInterface");
    }

    private static void privateStaticMetod() {
        System.out.println("privateStaticMetod() in MyInterface");
    }
}

interface MyInterface2 {
    default void method1() {
        System.out.println("method1() in MyInterface2");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}


/* Parent3 주석 지우기 전*/
//method1() in Child
//method2() in Parent
//staticMethod() in MyInterface
//privateStaticMetod() in MyInterface
//staticMethod() in MyInterface2

/* Parent3 주석 지운 후*/
//method1() in Child
//method2() in MyInterface
//privateMetod() in MyInterface
//staticMethod() in MyInterface
//privateStaticMetod() in MyInterface
//staticMethod() in MyInterface2
