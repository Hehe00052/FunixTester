package Bai1;

import java.util.Scanner;

public class Bai1 {
    public static int chiaPhanNguyen(float a, float b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Phép chia không hợp lệ: Chia cho 0");
            }
            return (int) (a / b);
        } catch (ArithmeticException e) {
            throw e;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b;

        try {
            System.out.print("Nhập số a: ");
            a = scanner.nextFloat();
            System.out.print("Nhập số b: ");
            b = scanner.nextFloat();

            int result = chiaPhanNguyen(a, b);
            System.out.println("Kết quả phép chia a / b (phần nguyên): " + result);
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
