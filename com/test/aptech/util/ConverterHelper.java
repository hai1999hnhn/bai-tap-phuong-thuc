package day6.com.test.aptech.util;

public class ConverterHelper {
    private double doF;
    private double inch;
    private double met;

    public ConverterHelper(double doF, double inch, double met) {
        this.doF = doF;
        this.inch = inch;
        this.met = met;
    }

    public double ChuyenDoiNhietDo() {
        return (this.doF - 32) / 1.8;
    }

    public Double ChuyenInchSangMet() {
        return this.inch * 0.0254;
    }

    public Double ChuyenMetSangInch() {
        return this.met * 39.3701;
    }
}
