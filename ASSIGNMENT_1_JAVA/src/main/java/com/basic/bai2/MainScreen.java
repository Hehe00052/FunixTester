package com.basic.bai2;

import java.util.Scanner;

public class MainScreen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên N > 0: ");
        int N = scanner.nextInt();

        if (N > 0) {
            int sumEven = 0, sumOdd = 0, countDivisibleBy3 = 0;

            for (int i = 0; i <= N; i++) {
                if (i % 2 == 0) {
                    sumEven += i;
                } else {
                    sumOdd += i;
                }

                if (i % 3 == 0 && i % 2 != 0) {
                    countDivisibleBy3++;
                }
            }

            System.out.println("Tổng các số chẵn: " + sumEven);
            System.out.println("Tổng các số lẻ: " + sumOdd);
            System.out.println("Số lượng số chia hết cho 3 nhưng không chia hết cho 2: " + countDivisibleBy3);
        } else {
            System.out.println("N phải lớn hơn 0.");
        }

        scanner.close();
    }
}
