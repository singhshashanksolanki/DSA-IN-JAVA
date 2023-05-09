package recursion;

// Print factorial of n

public class Question3 {

    public static int printFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_nm1 = printFactorial(n - 1);
        int fact = n * fact_nm1;
        return fact;
    }

    public static void main(String[] args) {
        int result = printFactorial(8);
        System.out.println(result);
    }
}
