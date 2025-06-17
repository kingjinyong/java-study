public class Main {

    //         *
//        **
//       ***
//      ****
//     *****
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5 - (i + 1); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();

//        *****
//        ******
//        *******
//        ********
//        *********

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

//             *
//            ***
//           *****
//          *******
//         *********
        for (int i = 1; i <= 5; i++) {

            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

//        *****
//         ***
//          *
//         ***
//        *****
        int n = 5;
        int mid = n / 2;
        for (int i = 0; i <= mid; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = mid + 1; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - 2 * (n - i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

//        *   *
//        ** **
//        *****
//        ** **
//        *   *
        int N = 5;
        for (int i = 0; i < N; i++) {
            if (i == N / 2) {
                for (int j = 0; j < N; j++) {
                    System.out.print("*");
                }
            } else {
                int star, space;
                if (i < N / 2) {
                    star = i + 1;
                    space = N - 2 * star;
                } else {
                    star = N - i;
                    space = N - 2 * star;
                }

                for (int j = 0; j < star; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < star; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
