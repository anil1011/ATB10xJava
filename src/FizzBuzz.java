public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz"); // Multiples of both 3 and 5
            } else if (i % 3 == 0) {
                System.out.println("Fizz"); // Multiples of 3
            } else if (i % 5 == 0) {
                System.out.println("Buzz"); // Multiples of 5
            } else {
                System.out.println(i); // Print the number
            }
        }
    }
}
