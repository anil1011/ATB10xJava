import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();
        System.out.print("Enter third number (c): ");
        int c = scanner.nextInt();

        // Using ternary operator to find the largest number
        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        // Display the result
        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}
