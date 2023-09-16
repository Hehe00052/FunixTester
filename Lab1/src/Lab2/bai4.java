package Lab2;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Display the question and answer options
        System.out.println("Ai la nguoi xinh dep nhat cai lobby nay?");
        System.out.println("A. Huynh Tran Nam Phuong");
        System.out.println("B. Ahri");
        System.out.println("C. Bronya");
        System.out.println("D. Selee");
        
        System.out.print("Your answer: ");
        String userAnswer = scanner.nextLine();
        userAnswer = userAnswer.trim().toUpperCase();
        
        // Check the user's answer using switch-case
        switch (userAnswer) {
            case "A":
                System.out.println("Correct answer!");
                break;
            case "C":
            	System.out.println("Wrong answer.");
                break;
            case "B":
            	System.out.println("Wrong answer.");
                break;
            case "D":
                System.out.println("Wrong answer.");
                break;
            default:
                System.out.println("Invalid answer.");
        }
        
        scanner.close();
    }
}

