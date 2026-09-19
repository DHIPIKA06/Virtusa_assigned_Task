import java.util.Scanner;

public class Fibonacci {

    static void printFibonacci(int numberOfTerms) {
        int first = 0;
        int second = 1;

        for (int i = 0; i < numberOfTerms; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int numberOfTerms = scanner.nextInt();

        if (numberOfTerms <= 0) {
            System.out.println("Number of terms must be positive.");
        } else {
            System.out.println("Fibonacci series:");
            printFibonacci(numberOfTerms);
        }

        scanner.close();
    }
}