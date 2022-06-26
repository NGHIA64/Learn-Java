package Baitap_Mau;
import java.util.Scanner;

public class bai2 {
	private static Scanner scanner = new Scanner (System.in);
    public static void main(String [] args) {
        System.out.print("Nhap vao ban kinh cua hinh tron r = ");
        int r = bai2.scanner.nextInt();
        System.out.print("Ban kinh cua hinh tron do la: " + r );
        System.out.println();
        final float PI = 3.14f;
        bai2.chuVi(r, PI);
        bai2.dienTich(r, PI);
        scanner.close();
    }
    
    public static void chuVi(int r, float PI) {
        float chuVi = 2 * r * PI;
        System.out.println("Chu vi cua hinh tron la = " + chuVi);
    }
    
    public static void dienTich(int r, float PI) {
        float dienTich = r * r * PI;
        System.out.println("Dien tich hinh tron la = " + dienTich);
    }
}


