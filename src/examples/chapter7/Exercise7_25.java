package examples.chapter7;

import examples.chapter7.Outer.Inner;

class Outer {
    static class Inner {
        int iv = 200;
    }
}

public class Exercise7_25 {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        System.out.println(inner.iv);
    }
}
