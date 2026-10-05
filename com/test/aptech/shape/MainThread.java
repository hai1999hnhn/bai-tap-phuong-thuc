package day6.com.test.aptech.shape;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chieu dai :");
        double chieuDai = sc.nextDouble();
        System.out.println("nhap vao chieu rong :");
        double chieuRong = sc.nextDouble();
        Rectangle hinhChuNhat = new Rectangle(chieuDai, chieuRong);
        System.out.println("chu vi cua hinh chu nhat la: " + hinhChuNhat.ChuVi());
        System.out.println("dien tich cua hinh chu nhat la: " + hinhChuNhat.DienTich());
    }
}
