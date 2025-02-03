import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine().toLowerCase(); // Convert to lowercase

        // Initialize vowel and consonant counters
        int vowels = 0, consonants = 0;

        // Iterate through each character
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) { // Check if it is a letter
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++; // If vowel
                } else {
                    consonants++; // If consonant
                }
            }
        }

        // Output the result
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        scanner.close();
    }
}
