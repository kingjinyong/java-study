package javajungseok.practices;

public class practice_4 {
    public static void main(String[] args) {
        int bingoCount = 0;

        int[][] bingoAry = {
                {1, 0, 0, 0, 1},
                {1, 1, 1, 1, 1},
                {1, 0, 1, 0, 0},
                {1, 1, 0, 1, 0},
                {1, 0, 0, 0, 1}};

        int count3 = 0;
        int count4 = 0;

        for (int i = 0; i < 5; i++) {
            // 가로검색
            int count1 = 0;
            for (int j = 0; j < 5; j++) {
                if (bingoAry[i][j] == 1) {
                    count1++;
                }
            }
            if (count1 == 5) {
                bingoCount++;
            }

            // 세로검색
            int count2 = 0;
            for (int j = 0; j < 5; j++) {
                if (bingoAry[j][i] == 1) {
                    count2++;
                }
            }
            if (count2 == 5) {
                bingoCount++;
            }

            for (int j = 0; j < 5; j++) {
                if (i == j && bingoAry[i][j] == 1) {
                    count3++;
                }
            }
            if (count3 == 5) {
                bingoCount++;
            }

            for (int j = 0; j < 5; j++) {
                if (i + j == 4 && bingoAry[i][j] == 1) {
                    count4++;
                }
            }
            if (count4 == 5) {
                bingoCount++;
            }
        }
        System.out.println(bingoCount);
    }
}