package java.examples.chapter7;


class SutdaDeck2 {
    final int CARD_NUM = 20;
    SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

    SutdaDeck2() {
        int kwangCount = 3;
        for (int i = 0; i < CARD_NUM; i++) {

            int num = i % 10 + 1;
            boolean isKwang = false;

            if ((num == 1 || num == 3 || num == 8) && kwangCount > 0) {
                isKwang = true;
                kwangCount -= 1;
            }

            cards[i] = new SutdaCard2(num, isKwang);
        }
    }

    public void shuffle() {
        for (int i = 0; i < CARD_NUM; i++) {
            int randomIndex = (int) (Math.random() * CARD_NUM);
            SutdaCard2 temp = cards[randomIndex];
            cards[randomIndex] = cards[i];
            cards[i] = temp;
        }
    }

    public SutdaCard2 pick(int index) {
        return cards[index];
    }

    public SutdaCard2 pick() {
        return cards[(int) (Math.random() * CARD_NUM)];
    }
}

class SutdaCard2 {
    int num;
    boolean isKwang;

    SutdaCard2() {
        this(1, true);
    }

    SutdaCard2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info() 대신 Object클래스의 toString()을 오버라이딩했다.
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

public class Exercise7_2 {
    public static void main(String[] args) {
        SutdaDeck2 deck = new SutdaDeck2();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());

        deck.shuffle();
        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ", ");
        }

        System.out.println();
        System.out.println(deck.pick(0));
    }

}
