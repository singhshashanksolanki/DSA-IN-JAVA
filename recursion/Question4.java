package recursion;

// Print fibonacci series upto nth term

public class Question4 {

    public static void fibonacciSeries(int n, int a, int b) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        fibonacciSeries(n - 1, b, c);

    }

    public static void main(String[] args) {
        int a = 0, b = 1, n = 7;
        System.out.println(a);
        System.out.println(b);
        fibonacciSeries(n - 2, a, b);
    }
}
