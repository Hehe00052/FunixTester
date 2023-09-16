import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        
        // Input array elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Sorting the array using the Selection Sort algorithm
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the position of the smallest element (minIndex) with the current element (i)
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        // Print the sorted array in ascending order
        System.out.println("Array after sorting in ascending order:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}


