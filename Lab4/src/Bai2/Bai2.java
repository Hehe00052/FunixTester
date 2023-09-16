package Bai2;

import java.util.Scanner;

//Interface định nghĩa phương thức cho việc hiển thị thời khóa biểu và thông tin lớp
interface IhienThi {
 void hienThiThoKhoaBieu();
 void hienThiThongTinLop();
}

//Lớp cha Person
class Person {
 protected String hoTen;
 protected String gioiTinh;
 protected String queQuan;
 protected int namSinh;

 public void hienThiThongTin() {
     System.out.println("Họ tên: " + hoTen);
     System.out.println("Giới tính: " + gioiTinh);
     System.out.println("Quê quán: " + queQuan);
     System.out.println("Năm sinh: " + namSinh);
 }

 public void nhapThongTin(Scanner scanner) {
     System.out.print("Họ tên: ");
     hoTen = scanner.nextLine();
     System.out.print("Giới tính: ");
     gioiTinh = scanner.nextLine();
     System.out.print("Quê quán: ");
     queQuan = scanner.nextLine();
     System.out.print("Năm sinh: ");
     namSinh = Integer.parseInt(scanner.nextLine());
 }
}

//Lớp HocSinh kế thừa từ Person và implement interface IhienThi
class HocSinh extends Person implements IhienThi {
 private String thoiKhoaBieu;
 private String tenGiaoVienChuNhiem;
 private String lopHoc;

 @Override
 public void hienThiThoKhoaBieu() {
     System.out.println("Thời khóa biểu: " + thoiKhoaBieu);
 }

 @Override
 public void hienThiThongTinLop() {
     System.out.println("Lớp đang học: " + lopHoc);
 }

 @Override
 public void hienThiThongTin() {
     super.hienThiThongTin();
     System.out.println("Thời khóa biểu: " + thoiKhoaBieu);
     System.out.println("Tên giáo viên chủ nhiệm: " + tenGiaoVienChuNhiem);
     System.out.println("Lớp đang học: " + lopHoc);
 }

 @Override
 public void nhapThongTin(Scanner scanner) {
     super.nhapThongTin(scanner);
     System.out.print("Thời khóa biểu: ");
     thoiKhoaBieu = scanner.nextLine();
     System.out.print("Tên giáo viên chủ nhiệm: ");
     tenGiaoVienChuNhiem = scanner.nextLine();
     System.out.print("Lớp đang học: ");
     lopHoc = scanner.nextLine();
 }
}

//Lớp GiaoVien kế thừa từ Person và implement interface IhienThi
class GiaoVien extends Person implements IhienThi {
 private String lopChuNhiem;
 private String tenBoMon;
 private String thoiKhoaBieuDay;

 @Override
 public void hienThiThoKhoaBieu() {
     System.out.println("Thời khóa biểu dạy: " + thoiKhoaBieuDay);
 }

 @Override
 public void hienThiThongTinLop() {
     System.out.println("Lớp đang chủ nhiệm: " + lopChuNhiem);
 }

 @Override
 public void hienThiThongTin() {
     super.hienThiThongTin();
     System.out.println("Lớp đang chủ nhiệm: " + lopChuNhiem);
     System.out.println("Tên bộ môn: " + tenBoMon);
     System.out.println("Thời khóa biểu dạy: " + thoiKhoaBieuDay);
 }

 @Override
 public void nhapThongTin(Scanner scanner) {
     super.nhapThongTin(scanner);
     System.out.print("Lớp đang chủ nhiệm: ");
     lopChuNhiem = scanner.nextLine();
     System.out.print("Tên bộ môn: ");
     tenBoMon = scanner.nextLine();
     System.out.print("Thời khóa biểu dạy: ");
     thoiKhoaBieuDay = scanner.nextLine();
 }
}

//Lớp NhanVien kế thừa từ Person
class NhanVien extends Person {
 private String phongBan;
 private String chucVu;

 @Override
 public void hienThiThongTin() {
     super.hienThiThongTin();
     System.out.println("Phòng ban: " + phongBan);
     System.out.println("Chức vụ: " + chucVu);
 }

 @Override
 public void nhapThongTin(Scanner scanner) {
     super.nhapThongTin(scanner);
     System.out.print("Phòng ban: ");
     phongBan = scanner.nextLine();
     System.out.print("Chức vụ: ");
     chucVu = scanner.nextLine();
 }
}

//Lớp LopHoc
class LopHoc {
 private String tenLop;
 private int siSo;
 private String khoi;

 public void nhapThongTin(Scanner scanner) {
     System.out.print("Nhập tên lớp: ");
     tenLop = scanner.nextLine();
     System.out.print("Nhập sĩ số: ");
     siSo = Integer.parseInt(scanner.nextLine());
     System.out.print("Nhập khối: ");
     khoi = scanner.nextLine();
 }

 @Override
 public String toString() {
     return "Tên lớp: " + tenLop + ", Sĩ số: " + siSo + ", Khối: " + khoi;
 }
}

public class Bai2 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     LopHoc lopHoc = new LopHoc();
     System.out.println("Nhập thông tin lớp học:");
     lopHoc.nhapThongTin(scanner);

     HocSinh hocSinh = new HocSinh();
     System.out.println("\nNhập thông tin học sinh:");
     hocSinh.nhapThongTin(scanner);

     GiaoVien giaoVien = new GiaoVien();
     System.out.println("\nNhập thông tin giáo viên:");
     giaoVien.nhapThongTin(scanner);

     NhanVien nhanVien = new NhanVien();
     System.out.println("\nNhập thông tin nhân viên:");
     nhanVien.nhapThongTin(scanner);

     System.out.println("\nThông tin lớp học:");
     System.out.println(lopHoc);

     System.out.println("\nThông tin học sinh:");
     hocSinh.hienThiThongTin();
     hocSinh.hienThiThoKhoaBieu();
     hocSinh.hienThiThongTinLop();

     System.out.println("\nThông tin giáo viên:");
     giaoVien.hienThiThongTin();
     giaoVien.hienThiThoKhoaBieu();
     giaoVien.hienThiThongTinLop();

     System.out.println("\nThông tin nhân viên:");
     nhanVien.hienThiThongTin();
 }
}

