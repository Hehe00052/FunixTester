package Lab2;

import java.util.Scanner;


//public class bai1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("nam muon xet la: ");
//        int year = scanner.nextInt();
//        
//        boolean isLeapYear = false;
//        
//        if (year % 400 == 0) {
//            isLeapYear = true;
//        } else if (year % 4 == 0 && year % 100 != 0) {
//            isLeapYear = true;
//        }
//        
//        if (isLeapYear) {
//            System.out.println( "dung z.");
//        } else {
//            System.out.println("khong phai.");
//        }
//        scanner.close();
//    }
//}

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();
        
        double delta = b * b - 4 * a * c;
        
        if (delta < 0) {
            System.out.println("The equation has no real roots.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("The equation has a double root: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The equation has two distinct roots:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        
        scanner.close();
    }
}


