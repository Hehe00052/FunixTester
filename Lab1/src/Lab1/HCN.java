package Lab1;
import java.util.Scanner;

public class HCN {
    public static class HinhChuNhat {
        public int dai;
        public int rong;

        public int tinhChuvi() {
            int chuvi = (this.dai + this.rong) * 2;
            return chuvi; 
        }
        
        public int tinhDienTich() {
            int dientich = this.dai * this.rong;
            return dientich;
        }
    }

    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào chiều dài: ");
        int chieudai = scanner.nextInt(); 
        hcn.dai = chieudai; 

        System.out.print("Nhập vào chiều rộng: ");
        int chieurong = scanner.nextInt();
        hcn.rong = chieurong; 

        int chuvi = hcn.tinhChuvi();
        int dientich = hcn.tinhDienTich();

        System.out.println("Chu vi hình chữ nhật = " + chuvi);
        System.out.println("Diện tích hình chữ nhật = " + dientich);

        scanner.close();
    }
}
