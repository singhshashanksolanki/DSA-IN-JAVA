package searching;

public class BinarySearchImp {
    public static void main(String[] args) {
        int num[] = { 1, 2, 4, 5, 8, 12 };
        System.out.println(binarySearch(num, 1));
    }

    private static int binarySearch(int numbers[], int numberToFind) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int middlePosition = (left + right) / 2;
            int middleNumber = numbers[middlePosition];
            if (numberToFind == middleNumber) {
                return middlePosition;
            }
            if (numberToFind < middleNumber) {
                right = middlePosition - 1;
            } else {
                left = middlePosition + 1;
            }
        }
        return -1;
    }
}
