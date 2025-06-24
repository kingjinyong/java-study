package practices;

public class practice_2 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3};
        int[] arr2 = {2, 1, 3};
        int s = 0;
        int b = 0;

        // arr과 arr2를 같이 순환 함.
        // 동시에 같은 숫자가 나오면 s++
        // 다 돌았는데도 해당 인덱스에서 동시에 같은 값이 나오지 못 하면
        // 해당 인덱스 기준으로 다음 인덱스부터 끝 인덱스까지 검사
        // 같은 숫자 나오면 b++
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
