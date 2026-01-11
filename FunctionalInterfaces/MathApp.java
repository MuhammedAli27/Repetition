package FunctionalInterfaces;

public class MathApp {
    public static void main(String[] args) {

        MathOperation addition = (a, b) -> a + b;
        MathOperation multiplication = (a, b) -> a * b;

        System.out.println(addition.apply(3, 4));
        System.out.println(multiplication.apply(3, 4));
    }
}
