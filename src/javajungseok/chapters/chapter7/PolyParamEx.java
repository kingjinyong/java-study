package javajungseok.chapters.chapter7;

class Product3 {
    int price;      // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스 점수

    Product3(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0); // 보너스 점수는 제품 가격의 10%
    }
}

class Tv3 extends Product {
    Tv3() {
        // 조상 클래스의 생성자 Product(int price)를 호출한다.
        super(100);     // Tv의 가격을 100만원으로 한다.
    }

    // Object의 toString() 을 오버라이딩한다.
    public String toString() {
        return "Tv";
    }
}

class Computer3 extends Product {
    Computer3() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Buyer3 {          // 고객, 물건을 사는 사람
    int money = 1000;   // 소유금액
    int bonusPoint = 0; // 보너스점수

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;       // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
        System.out.println(p + "을/를 구입했습니다.");
    }
}

public class PolyParamEx {
    public static void main(String[] args) {
        Buyer3 b = new Buyer3();

        b.buy(new Tv());
        b.buy(new Computer3());

        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다.");
    }
}
