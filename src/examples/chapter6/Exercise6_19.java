package examples.chapter6;

public class Exercise6_19 {
    public static void change(String str) {
        str += "456";
    }

    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str);
        Exercise6_19.change(str);
        System.out.println("After change: " + str);
    }
}
