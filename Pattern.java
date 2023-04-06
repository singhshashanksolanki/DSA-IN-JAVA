// // Homework questions 1: Print a solid rhombus
// class Pattern {
//     public static void main(String args[]) {
//         // Printing the rhombus
//         int n = 7;
//         // For rows
//         for (int i = n; i > 0; i--) {
//             // For printing space
//             for (int j = 0; j < i - 1; j++) {
//                 System.out.print(" ");
//             }
//             // For printing starts
//             for (int k = 0; k < n; k++) {
//                 System.out.print("*");
//             }
//             // For next line
//             System.out.println();
//         }
//     }
// }

// // Homework questions 2: Print a number pyramid
// class Pattern {
// public static void main(String args[]) {
// // Printing the number pyramid
// // For number of rows in pyramid
// int n = 8;
// // For Printing rows
// for (int i = 1; i <= n; i++) {
// // For printing spaces
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }
// // for printing stars
// for (int k = 1; k <= i; k++) {
// System.out.print(i + " ");
// }
// // For printing next line
// System.out.println();
// }
// }
// }

// // Homework questions 3: Print a palindromic number pyramid
// class Pattern {
//     public static void main(String args[]) {
//         // Printing the palindromic number pyramid
//         // For number of rows in palindromic number pyramid
//         int n = 5;
//         // Loop for rows
//         for (int i = 1; i <= n; i++) {
//             // For printing spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             // For printing numbers;
//             for (int k = i; k >= 1; k--) {
//                 System.out.print(k);
//             }
//             // // For next half of pyrmaid
//             for (int j = 2; j <= i; j++) {
//                 System.out.print(j);
//             }
//             // For next line
//             System.out.println();
//         }
//     }
// }

// Homework questions 4: In Solutions doc
class Pattern {
    public static void main(String args[]) {
        // For number of rows in a pattern
        int n = 4;
        // For upper part
        // Loop for rows
        for (int i = 1; i <= n; i++) {
            // For printing spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // For printing stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // For printing line
            System.out.println();
        }
        // For lower part
        for (int i = n; i >= 1; i--) {
            // For printing spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // For printing stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // For printing line
            System.out.println();
        }
    }
}
