package Lab1;
import java.util.Scanner;

public class triangle {
    public double a;
    public double b;
    public double c;

    public double tinhChuVi() {
        return a + b + c;
    }

    public double tinhDienTich() {
        double p = tinhChuVi() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        triangle triangle = new triangle();

        System.out.print("Nhập vào cạnh a: ");
        triangle.a = scanner.nextDouble();

        System.out.print("Nhập vào cạnh b: ");
        triangle.b = scanner.nextDouble();

        System.out.print("Nhập vào cạnh c: ");
        triangle.c = scanner.nextDouble();

        double chuvi = triangle.tinhChuVi();
        double dientich = triangle.tinhDienTich();

        System.out.println("Chu vi tam giác = " + chuvi);
        System.out.println("Diện tích tam giác = " + dientich);

        scanner.close();
    }
}
