import java.util.Scanner;

/**
 * Prints Pascal's Triangle up to N rows, where N is provided by the
 * user at runtime.
 */
public class PascalsTriangle {

    /**
     * Calculates a single binomial coefficient C(row, col).
     */
    private static long binomialCoefficient(int row, int col) {
        long result = 1;
        for (int i = 0; i < col; i++) {
            result = result * (row - i) / (i + 1);
        }
        return result;
    }

    /**
     * Prints the triangle for the given number of rows, centered
     * for readability.
     */
    public static void printTriangle(int numberOfRows) {
        for (int row = 0; row < numberOfRows; row++) {
            // Leading spaces so the triangle looks centered.
            for (int space = 0; space < numberOfRows - row; space++) {
                System.out.print(" ");
            }

            for (int col = 0; col <= row; col++) {
                System.out.print(binomialCoefficient(row, col) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (N): ");
        int numberOfRows = scanner.nextInt();

        if (numberOfRows <= 0) {
            System.out.println("N must be a positive integer.");
        } else {
            printTriangle(numberOfRows);
        }

        scanner.close();
    }
}
