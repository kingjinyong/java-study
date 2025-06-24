package practices;

import java.util.Random;
import java.util.Scanner;

public class practice_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        int[] arr2 = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            arr2[i] = scanner.nextInt();
        }

        int s = 0;
        int b = 0;
        int cnt = 0;

        // arr과 arr2를 같이 순환 함.
        // 동시에 같은 숫자가 나오면 s++
        // 다 돌았는데도 해당 인덱스에서 동시에 같은 값이 나오지 못 하면
        // 해당 인덱스 기준으로 다음 인덱스부터 끝 인덱스까지 검사
        // 같은 숫자 나오면 b++ 하고 탈출
        for (int i = 0; i < 3; i++) {
            if (arr[i] == arr2[i]) {
                cnt++;
                s++;
            } else {
                for (int j = 0; j < 3; j++) {
                    cnt++;
                    if (arr[i] == arr2[j]) {
                        b++;
                        break;
                    }
                }
            }
        }

        System.out.print("랜덤 숫자: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

        System.out.print("입력 숫자: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(arr2[i]);
        }
        System.out.println();
        System.out.println("결과: " + s + "S" + b + "B");
        System.out.println("연산 횟수: " + cnt);
    }
}
