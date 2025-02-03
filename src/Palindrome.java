import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Check for palindrome
        if (isPalindrome(str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }

    // Method to check if the string is a palindrome
    public static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            // Compare characters from start and end using charAt()
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false; // Not a palindrome
            }
        }
        return true; // It is a palindrome
    }
}

