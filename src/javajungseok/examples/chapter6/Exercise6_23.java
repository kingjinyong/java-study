package javajungseok.examples.chapter6;

public class Exercise6_23 {

    static int max(int[] dataAry) {
        if (dataAry == null || dataAry.length == 0) {
            return -999999;
        }
        int max = 0;
        for (int i = 0; i < dataAry.length; i++) {
            if (max < dataAry[i]) {
                max = dataAry[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:" + max(data));
        System.out.println("최대값:" + max(null));
        System.out.println("최대값:" + max(new int[]{})); // 크기가 0인 배열
    }
}
