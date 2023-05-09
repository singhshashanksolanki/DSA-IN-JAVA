package OOPS.inheritance;

class Shape3 {
    public void area() {
        System.out.println("Displays Area");
    }
}

class Triangle3 extends Shape3 {
    public void area(int b, int h) {
        System.out.println(1 / 2 * b * h);
    }
}

public class SingleLevel {
    public static void main(String[] args) {

    }
}
