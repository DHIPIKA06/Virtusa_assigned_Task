import java.util.Scanner;

/**
 * Prints the Fibonacci series up to N terms, where N is supplied
 * by the user at runtime (no hardcoded term count).
 */
public class FibonacciSeries {

    /**
     * Builds the first {@code numberOfTerms} Fibonacci numbers.
     *
     * @param numberOfTerms how many terms to generate (must be >= 0)
     * @return array containing the Fibonacci sequence
     */
    public static long[] generateFibonacci(int numberOfTerms) {
        long[] series = new long[numberOfTerms];

        for (int index = 0; index < numberOfTerms; index++) {
            if (index == 0) {
                series[index] = 0;
            } else if (index == 1) {
                series[index] = 1;
            } else {
                series[index] = series[index - 1] + series[index - 2];
            }
        }
        return series;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms (N): ");
        int numberOfTerms = scanner.nextInt();

        if (numberOfTerms <= 0) {
            System.out.println("N must be a positive integer.");
        } else {
            long[] fibonacciSeries = generateFibonacci(numberOfTerms);

            System.out.println("Fibonacci series up to " + numberOfTerms + " terms:");
            for (long term : fibonacciSeries) {
                System.out.print(term + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
