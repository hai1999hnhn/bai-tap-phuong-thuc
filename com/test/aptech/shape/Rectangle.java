package day6.com.test.aptech.shape;

public class Rectangle {
    private double chieuDai;
    private double chieuRong;

    public Rectangle(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double ChuVi() {
        return (this.chieuDai + this.chieuRong) * 2;
    }

    public double DienTich() {
        return this.chieuDai * this.chieuRong;
    }

}
