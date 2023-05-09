package OOPS;

abstract class Animal1 {
    abstract void walk();
}

class Horse1 extends Animal1 {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken1 extends Animal1 {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public abstract class Abstraction {
    public static void main(String[] args) {
        Horse1 horse = new Horse1();
        horse.walk();

    }
}
