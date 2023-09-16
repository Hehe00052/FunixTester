package com.basic.bai1;

import java.util.Scanner;

public class MyMainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất x = ");
        double x = scanner.nextDouble();

        System.out.print("Nhập số thứ hai y = ");
        double y = scanner.nextDouble();

        System.out.print("Nhập lệnh ACTION = ");
        scanner.nextLine();

        String action = scanner.nextLine();

        double result;
        switch (action.toUpperCase()) {
            case "CONG":
                result = CalculateUtils.tinhCong(x, y);
                break;
            case "TRU":
                result = CalculateUtils.tinhTru(x, y);
                break;
            case "NHAN":
                result = CalculateUtils.tinhNhan(x, y);
                break;
            case "CHIA":
                result = CalculateUtils.tinhChia(x, y);
                break;
            default:
                System.out.println("Giá trị ACTION không hợp lệ");
                scanner.close();
                return;
        }

        System.out.println("Kết quả: " + result);
        scanner.close();
    }
}
