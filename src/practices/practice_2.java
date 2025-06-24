package practices;

public class practice_2 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3};
        int[] arr2 = {2, 1, 3};
        int s = 0;
        int b = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr2[i]) {
                s++;
            } else {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr2[j]) {
                        b++;
                        break;
                    }
                }
            }
        }
        System.out.println(s + "S" + b + "B");
    }
}
