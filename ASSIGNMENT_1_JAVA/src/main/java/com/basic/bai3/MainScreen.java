package com.basic.bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainScreen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();

        char continueInput;
        do {
            Student student = new Student();

            System.out.print("Nhập họ và tên: ");
            student.setFullName(scanner.nextLine());

            System.out.print("Nhập địa chỉ: ");
            student.setAddress(scanner.nextLine());

            System.out.print("Nhập ngày sinh (dd/mm/yyyy): ");
            student.setDob(scanner.nextLine());

            System.out.print("Nhập giới tính: ");
            student.setGender(scanner.nextLine());

            System.out.print("Nhập điểm tổng kết: ");
            student.setFinalGrade(scanner.nextFloat());

            studentList.add(student);

            System.out.print("Tiếp tục (Y/N)? ");
            continueInput = scanner.next().charAt(0);
            scanner.nextLine(); 

        } while (continueInput == 'Y' || continueInput == 'y');

        System.out.println("Danh sách học sinh:");
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("FullName: " + student.getFullName());
            System.out.println("Address: " + student.getAddress());
            System.out.println("DOB: " + student.getDob());
            System.out.println("Gender: " + student.getGender());
            System.out.println("FinalGrade: " + student.getFinalGrade());
        }

        System.out.println("Danh sách học lực:");
        for (Student student : studentList) {
            if (student.getFinalGrade() < 4.0) {
                System.out.println("Học sinh " + student.getFullName() + " học lực kém");
            } else if (student.getFinalGrade() < 5.0) {
                System.out.println("Học sinh " + student.getFullName() + " học lực yếu");
            } else if (student.getFinalGrade() < 5.5) {
                System.out.println("Học sinh " + student.getFullName() + " học lực trung bình yếu");
            } else if (student.getFinalGrade() < 6.5) {
                System.out.println("Học sinh " + student.getFullName() + " học lực trung bình");
            } else if (student.getFinalGrade() < 7.0) {
                System.out.println("Học sinh " + student.getFullName() + " học lực trung bình khá");
            } else if (student.getFinalGrade() < 8.0) {
                System.out.println("Học sinh " + student.getFullName() + " học lực khá");
            } else if (student.getFinalGrade() < 8.5) {
                System.out.println("Học sinh " + student.getFullName() + " học lực khá giỏi");
            } else {
                System.out.println("Học sinh " + student.getFullName() + " học lực giỏi");
            }
        }

        float totalGrade = 0;
        for (Student student : studentList) {
            totalGrade += student.getFinalGrade();
        }
        float averageGrade = totalGrade / studentList.size();
        System.out.println("Điểm tổng kết trung bình của danh sách học sinh: " + averageGrade);

        scanner.close();
    }
}
