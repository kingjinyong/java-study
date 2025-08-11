package java.examples.chapter7;


class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        int kwangCount = 3;
        for (int i = 0; i < CARD_NUM; i++) {

            int num = i % 10 + 1;
            boolean isKwang = false;

            if ((num == 1 || num == 3 || num == 8) && kwangCount > 0) {
                isKwang = true;
                kwangCount -= 1;
            }

            cards[i] = new SutdaCard(num, isKwang);

        }
    }
}

class SutdaCard {
    private final int num;
    private final boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info() 대신 Object클래스의 toString()을 오버라이딩했다.
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

public class Exercise7_1 {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();
        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ", ");
        }
    }

}
