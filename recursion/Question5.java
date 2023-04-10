package recursion;

// Print x**n (stack height = n)

public class Question5 {

    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xPownm1 = calcPower(x, n - 1);
        int xPown = x * xPownm1;
        return xPown;
    }

    public static void main(String[] args) {
        int n = 5, x = 2, result;
        result = calcPower(x, n);
        System.out.println(result);
    }
}
