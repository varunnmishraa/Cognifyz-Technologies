import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Select a number pattern type
        System.out.println("Select a number pattern type:");
        System.out.println("1. Pyramid");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the number of rows for the pyramid: ");
                int rows = scanner.nextInt();
                printPyramid(rows);
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
        }

        scanner.close();
    }

    // Function to print pyramid pattern
    public static void printPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            printSpaces(rows - i);
            printIncreasingSequence(i);
            printDecreasingSequence(i);
            System.out.println();
        }
    }

    // Function to print spaces
    public static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("  ");
        }
    }

    // Function to print increasing sequence of numbers
    public static void printIncreasingSequence(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print(i + " ");
        }
    }

    // Function to print decreasing sequence of numbers
    public static void printDecreasingSequence(int count) {
        for (int i = count - 1; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}

