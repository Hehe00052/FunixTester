package Lab2;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt();
        
        int primeCount = 0; // Initialize the prime count
        
        System.out.println("Prime numbers from 1 to " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (isPrime(i)) {
                primeCount++; // Increment the prime count
                System.out.print(i + " ");
            }
        }
        
        System.out.println("\nTotal prime numbers from 1 to " + N + ": " + primeCount);
        
        scanner.close();
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
