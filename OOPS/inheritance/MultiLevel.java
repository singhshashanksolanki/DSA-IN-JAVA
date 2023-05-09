package OOPS.inheritance;

class Shape2 {
    public void area() {
        System.out.println("Displays Area");
    }
}

class Triangle2 extends Shape2 {
    public void area(int b, int h) {
        System.out.println(1 / 2 * b * h);
    }
}

class EquilateralTriangle2 extends Triangle2 {
    public void area(int b, int h) {
        System.out.println(1 / 2 * b * h);
    }
}

public class MultiLevel {
    public static void main(String[] args) {

    }
}
