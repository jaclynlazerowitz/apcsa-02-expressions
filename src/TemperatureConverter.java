/**
 * Exercise 7 — TemperatureConverter
 *
 * Convert both directions, to one decimal place.
 *
 *   C = (F - 32) * 5 / 9
 *   F = C * 9 / 5 + 32
 *
 * ⚠️ Careful: 5 / 9 in integer arithmetic is 0.
 *    Everything after that will be zero. Fix it.
 */
public class TemperatureConverter {
    public static void main(String[] args) {
        double fahrenheit = 98.6;
        double celsius = 37.0;

        double mathC = 5/9; //fix
        double mathF = 9/5;

        double calcF = (celsius * mathF) + 32;
        double calcC = (fahrenheit - 32) * mathC;

        System.out.println("Celsius: " + calcC);
        System.out.println("Farenheit: " + calcF);
        System.out.println(mathC);

    }
}
