package OOPS.inheritance;

class Shape1 {
    public void area() {
        System.out.println("Displays Area");
    }
}

class Triangle1 extends Shape1 {
    public void area(int b, int h) {
        System.out.println(1 / 2 * b * h);
    }
}

class EquilateralTriangle1 extends Triangle1 {
    public void area(int b, int h) {
        System.out.println(1 / 2 * b * h);
    }
}

class Circle1 extends Shape1 {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

public class Hybrid {
    public static void main(String[] args) {

    }
}
