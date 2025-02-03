import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their numerical score
        System.out.print("Enter your numerical score: ");
        double score = scanner.nextDouble();

        // Calculate and display the letter grade
        String grade = calculateGrade(score);
        System.out.println("Your letter grade is: " + grade);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the letter grade based on the score
    public static String calculateGrade(double score) {
        if (score >= 90 && score <= 100) {
            return "A";
        } else if (score >= 80 && score < 90) {
            return "B";
        } else if (score >= 70 && score < 80) {
            return "C";
        } else if (score >= 60 && score < 70) {
            return "D";
        } else if (score >= 0 && score < 60) {
            return "F";
        } else {
            return "Invalid score. Please enter a score between 0 and 100.";
        }
    }
}
