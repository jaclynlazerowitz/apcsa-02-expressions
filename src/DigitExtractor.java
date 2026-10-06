/**
 * Exercise 3 — DigitExtractor
 *
 * Given a 3-digit integer, print each digit on its own line,
 * then print the sum of the digits.
 *
 * Example: 472
 *   Hundreds: 4
 *   Tens:     7
 *   Ones:     2
 *   Sum:      13
 *
 * Hint: n % 10 gives you the last digit. n / 10 removes it.
 */
public class DigitExtractor {
    public static void main(String[] args) {
        int number = 472;

        int hundreds = number/100;
        int remainder = number%100;

        int tens = remainder/10;
        remainder = remainder%10;

        int ones = remainder/1;

        int sum = hundreds+tens+ones;

System.out.println("Hundreds: " + hundreds);
System.out.println("Tens: " + tens);
System.out.println("Ones: " + ones);
System.out.println("Sum: " + sum);


    }
}
