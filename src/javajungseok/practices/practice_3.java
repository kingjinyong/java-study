package javajungseok.practices;

public class practice_3 {

    static int mid(int a, int b, int c) {
        int[] ary = new int[3];
        ary[0] = a;
        ary[1] = b;
        ary[2] = c;

        int max = -1;
        int min = 2_000_000_000;

        for (int i = 0; i < 3; i++) {
            if (ary[i] > max) {
                max = ary[i];
            }
            if (ary[i] < min) {
                min = ary[i];
            }
        }

        return a + b + c - min - max;

    }

    public static void main(String[] args) {
        System.out.println(mid(1, 1, 3));
    }
}
