import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(); // Read input
        scanner.close();
        
        // Calculate the minimum steps required
        int steps = x / 5; // Full steps of 5
        if (x % 5 != 0) {
            steps += 1; // Add one more step if there's a remainder
        }

        System.out.println(steps); // Output the result
    }
}
