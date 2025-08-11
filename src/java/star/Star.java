package java.star;

public class Star {

    public static void main(String[] args) {
//        *****
//        *****
//        *****
//        *****
//        *****
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

//    *     *
//     *   *
//       *
//     *   *
//    *     *

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j || i + j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

//         *
//        **
//       ***
//      ****
//     *****
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
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i >= j && i + j >= 4) || (i <= j && i + j <= 4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

//        *   *
//        ** **
//        *****
//        ** **
//        *   *
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (!((i > j && i + j > 4) || (i < j && i + j < 4))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }
}
