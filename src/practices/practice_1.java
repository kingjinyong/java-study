package practices;

public class practice_1 {
    public static void main(String[] args) {

        int[] numArr = new int[10];
        int[] counter = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10);
            System.out.print(numArr[i]);
        }

        System.out.println();

        for (int i = 0; i < numArr.length; i++) {
            counter[numArr[i]] += 1;
        }

        for (int i = 0; i < counter.length; i++) {
            System.out.println(i + "의 개수:" + counter[i]);
        }

//        counter에서 값이 0개 이상 나온거 출력 해주면 됨
        System.out.print("1번 답: ");
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > 0) {
                System.out.print(i);
            }
        }

        System.out.println();

//        이중 포문 사용해서 카운터 안의 값의 개수만큼 해당 요소의 번호를 반복해주면 됨.
        System.out.print("2번 답: ");
        for (int i = 0; i < counter.length; i++) {
            for (int j = 0; j < counter[i]; j++) {
                System.out.print(i);
            }
        }
    }
}
