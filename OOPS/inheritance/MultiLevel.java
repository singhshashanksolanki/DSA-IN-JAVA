package OOPS.inheritance;

class Shape {
    public void area() {
        System.out.println("Displays Area");
    }
}

class Triangle extends Shape {
    public void area(int b, int h) {
        System.out.println(1 / 2 * b * h);
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int b, int h) {
        System.out.println(1 / 2 * b * h);
    }
}

public class MultiLevel {
    public static void main(String[] args) {

    }
}
