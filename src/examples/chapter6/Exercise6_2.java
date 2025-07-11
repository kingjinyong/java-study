package examples.chapter6;

public class Exercise6_2 {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int n, boolean b) {
        this.num = n;
        this.isKwang = b;
    }

    public String info() {
        if (isKwang) {
            return num + "K";
        } else {
            return num + "";
        }
    }
}
