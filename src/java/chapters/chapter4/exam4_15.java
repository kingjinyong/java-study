package java.chapters.chapter4;

public class exam4_15 {
    public static void main(String[] args) {
        // 1) 헤더 출력: 각 열의 너비를 맞춰줍니다.
        System.out.printf(
                "%4s %4s %4s %4s %4s %4s %4s%n",
                "i", "2*i", "2*i-1", "i*i", "11-i", "i%3", "i/3"
        );
        //      그냥   짝수      홀수    제곱     역순    순환    반복
        System.out.println("---------------------------------------");

        // 2) 데이터 출력: 같은 너비 포맷으로 출력
        for (int i = 1; i <= 10; i++) {
            System.out.printf(
                    "%4d %4d %4d %4d %4d %4d %4d%n",
                    i,              // 그냥
                    2 * i,          // 짝수
                    2 * i - 1,      // 홀수
                    i * i,          // 제곱
                    11 - i,         // 역순
                    i % 3,          // 순환
                    i / 3           // 반복
            );
        }
    }
}
