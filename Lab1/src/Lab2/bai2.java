package Lab2;
import java.util.Scanner;

	public class bai2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int total = 0;

	        do {
	            System.out.print("Enter an integer N: ");
	            int N = scanner.nextInt();
	            total += N; // Accumulate the sum

	            if (total >= 100) {
	                if (N % 2 != 0) {
	                    System.out.println("Decreasing odd number series:");
	                    while (N >= 1) {
	                        System.out.print(N + " ");
	                        N -= 2;
	                    }
	                } else {
	                    System.out.println("Decreasing even number series:");
	                    while (N >= 2) {
	                        System.out.print(N + " ");
	                        N -= 2;
	                    }
	                }
	            }
	        } while (total < 100);

	        scanner.close();
	    }
	}

