package chapter6;

class Tv2 {
    // Tv2의 속성(멤버 변수)
    String color;
    boolean power;
    int channel;

    // Tv2의 기능(메서드)
    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

public class TvEx2 {
    public static void main(String[] args) {
        Tv2 t1 = new Tv2();
        Tv2 t2 = new Tv2();

        System.out.println("t1의 channel값은 " + t1.channel + " 입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + " 입니다.");

        t1.channel = 7; // channel 값을 7로 한다.
        System.out.println("t1의 channel값을 7로 변경하였습니다.");

        System.out.println("t1의 channel값은 " + t1.channel + "입니다");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다");
    }
}
