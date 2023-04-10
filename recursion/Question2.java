package recursion;

// Print sum of first n natural numbers

public class Question2 {

    public static void printSum(int base, int n, int sum) {
        if (base > n) {
            System.out.println(sum);
            return;
        }
        sum += base;
        printSum(base + 1, n, sum);
    }

    public static void main(String args[]) {
        printSum(1, 3, 0);
    }
}
