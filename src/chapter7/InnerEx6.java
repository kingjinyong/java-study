package chapter7;

// 모두 다 익명 클래스
public class InnerEx6 {
    Object iv = new Object() {
        void method() {
        }
    };

    static Object cv = new Object() {
        void method() {
        }
    };

    void myMethod() {
        Object lv = new Object() {
            void method() {
            }
        };
    }
}
