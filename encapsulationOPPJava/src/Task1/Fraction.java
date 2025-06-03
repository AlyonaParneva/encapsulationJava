package Task1;

public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator <= 0) {
            throw new IllegalArgumentException("Знаменатель должен быть положительным");
        }

        if (numerator < 0) {
            numerator = -Math.abs(numerator);
        }

        int[] simplified = FractionUtils.simplify(numerator, denominator);
        this.numerator = simplified[0];
        this.denominator = simplified[1];
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
