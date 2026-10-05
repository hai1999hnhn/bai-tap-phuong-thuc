package day6.com.test.aptech.util;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao nhiet do F :");
        double nhietdoF = sc.nextDouble();
        ConverterHelper nhietdo = new ConverterHelper(nhietdoF, 0, 0);
        System.out.println("nhiet do " + nhietdoF + " F = " + nhietdo.ChuyenDoiNhietDo() + " C");
        System.out.println("nhap vao chieu dai inch :");
        double chieudaiInch = sc.nextDouble();
        ConverterHelper chieudaiInchSangMet = new ConverterHelper(0, chieudaiInch, 0);
        System.out.println("chieu dai " + chieudaiInch + " inch = " + chieudaiInchSangMet.ChuyenInchSangMet() + " m");
        System.out.println("nhap vao chieu dai met :");
        double chieudaiMet = sc.nextDouble();
        ConverterHelper chieudaiMetSangInch = new ConverterHelper(0, 0, chieudaiMet);
        System.out.println("chieu dai " + chieudaiMet + " met = " + chieudaiMetSangInch.ChuyenMetSangInch() + " inch");
    }
}
