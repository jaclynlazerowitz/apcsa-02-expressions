/**
 * Exercise 6 — TipCalculator
 *
 * Given a bill amount, a tip percentage, and a number of people,
 * print the tip, the total, and each person's share —
 * all rounded to exactly 2 decimal places.
 *
 * Rounding to 2 decimals:
 *   Math.round(value * 100) / 100.0
 *
 * Watch that .0 — leave it off and you're back in integer division.
 */
public class TipCalculator {
    public static void main(String[] args) {
        double billAmount = 87.35;
        int tipPercent = 18;
        int people = 4;

        System.out.println("Total bill: $" + billAmount);

        double tip = Math.round(billAmount * tipPercent / 100) * 100 / 100;

        System.out.println("Total tip: $" + tip);

        double shareTip = tip/4;

        System.out.println("Each person's tip: $" + shareTip);

    }
}
