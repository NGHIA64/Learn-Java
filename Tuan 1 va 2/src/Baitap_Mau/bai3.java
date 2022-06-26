package Baitap_Mau;
import java.util.Scanner;
import java.lang.Math;

public class bai3 {
	private static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) {
        System.out.print("Nhap do dai 3 cach cua tam giac: ");
        System.out.print("a = ");
        float a = bai3.scanner.nextFloat();
        System.out.print("c = ");
        float b = bai3.scanner.nextFloat();
        System.out.print("b = ");
        float c = bai3.scanner.nextFloat();
        bai3.chuVi(a, b, c);
        bai3.dienTich(a, b, c);
        System.out.println();
        scanner.close();
    }
    
    public static void chuVi(float a, float b, float c) {
        float chuVi = a + b + c;
        System.out.println("Chu vi cua tam giac tren la: " + chuVi);
    }
    
    public static void dienTich(float a, float b, float c) {
        float p = (a + b + c) / 2;
        float duongCao = (float) ((2 * (Math.sqrt(p * (p - a) * (p - b) * (p - c)))) / a);
        float dienTich = (float) (0.5 * a * ((2 * (Math.sqrt(p * (p - a) * (p - b) * (p - c)))) / a));
        System.out.println("Dien tich tam gia tren la: " + dienTich);
    }
}
