package recursion;

// Print Nubmers from n to 1
public class Question1 {

    public static void printNumbers(int x) {

        if (x <= 0) {
            return;
        }
        System.out.println(x);
        printNumbers(x - 1);
    }

    public static void main(String args[]) {
        printNumbers(5);
    }
}
