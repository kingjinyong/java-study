package examples.chapter6;

public class Exercise6_20 {

    public static int[] shuffle(int[] shuffleAry) {

        for (int i = 0; i < shuffleAry.length; i++) {
            int randomIndex = (int) (Math.random() * 8);
            int temp = shuffleAry[randomIndex];
            shuffleAry[randomIndex] = shuffleAry[i];
            shuffleAry[i] = temp;
        }
        return shuffleAry;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
