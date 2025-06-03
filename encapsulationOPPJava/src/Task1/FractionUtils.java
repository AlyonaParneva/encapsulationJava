package Task1;

public class FractionUtils {

    public static int[] simplify(int numerator, int denominator) {
        int gcd = gcd(Math.abs(numerator), denominator);
        return new int[]{numerator / gcd, denominator / gcd};
    }

    public static Fraction sum(Fraction f1, Fraction f2) {
        int newNumerator = f1.getNumerator() * f2.getDenominator() +
                f2.getNumerator() * f1.getDenominator();
        int newDenominator = f1.getDenominator() * f2.getDenominator();
        int[] simplified = simplify(newNumerator, newDenominator);
        return new Fraction(simplified[0], simplified[1]);
    }

    public static Fraction sum(Fraction f, int number) {
        int newNumerator = f.getNumerator() + number * f.getDenominator();
        int[] simplified = simplify(newNumerator, f.getDenominator());
        return new Fraction(simplified[0], simplified[1]);
    }

    public static Fraction minus(Fraction f1, Fraction f2) {
        int newNumerator = f1.getNumerator() * f2.getDenominator() -
                f2.getNumerator() * f1.getDenominator();
        int newDenominator = f1.getDenominator() * f2.getDenominator();
        int[] simplified = simplify(newNumerator, newDenominator);
        return new Fraction(simplified[0], simplified[1]);
    }

    public static Fraction minus(Fraction f, int number) {
        int newNumerator = f.getNumerator() - number * f.getDenominator();
        int[] simplified = simplify(newNumerator, f.getDenominator());
        return new Fraction(simplified[0], simplified[1]);
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
