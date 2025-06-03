package Task1;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 5);
        Fraction f3 = new Fraction(7, 8);

        Fraction result = FractionUtils.sum(f1, f2);
        result = FractionUtils.sum(result, f3);
        result = FractionUtils.minus(result, 5);

        System.out.println("Результат: " + result);
    }
}
