package examples.chapter7;


public class Exercise7_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv1());
        b.buy(new Computer());
        b.buy(new Tv1());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}

class Buyer {
    int money = 1000;
    Product1[] cart = new Product1[3];
    int i = 0;

    void buy(Product1 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 " + p + "을/를 살 수 없습니다.");
        } else {
            money -= p.price;
            add(p);
        }

    }

    void add(Product1 p) {
        if (i >= cart.length) {
            Product1[] tempAry = new Product1[cart.length * 2];
            for (int j = 0; j < cart.length; j++) {
                tempAry[j] = cart[j];
            }
            cart = tempAry;
        }
        cart[i] = p;
        i++;
    }

    void summary() {
        int totalPrice = 0;
        System.out.print("구입한 물건:");
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] != null) {
                System.out.print(cart[i] + ",");
                totalPrice += cart[i].price;

            }
        }
        System.out.println();
        System.out.println("사용한 금액:" + totalPrice);

        int saveMoney = 1000 - totalPrice;
        System.out.println("남은 금액:" + saveMoney);

    }
}

class Product1 {
    int price;

    Product1(int price) {
        this.price = price;
    }
}

class Tv1 extends Product1 {
    Tv1() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Product1 {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product1 {
    Audio() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}