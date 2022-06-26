package Baitap_Mau;
import java.util.Scanner;

public class bai1 {
	private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Nhap so nguyen duong a: ");
        int a = bai1.scanner.nextInt();
        System.out.print("Nhap so nguyen duong b: ");
        int b = bai1.scanner.nextInt();
        System.out.print("Nhap so nguyen duong c: ");
        int c = bai1.scanner.nextInt();
        System.out.print("Cac so vua nhap la:");
        System.out.print(" a = " + a);
        System.out.print(". b = " + b);
        System.out.print(". c = " + c);
        System.out.println();
        bai1.max(a, b, c);
        bai1.giaTriTB(a, b, c);
        bai1.tong(a, b, c);
        scanner.close();
    }
    
    public static void max(int a, int b, int c){
        int max = a;
        if(max < b){
            max = b;
        }
        if(max < c){
            max = c;
        }
        System.out.println("So lon nhat trong ba so la: " + max);
        
    }
    
    public static void giaTriTB(int a, int b, int c){
        double TB = (a + b + c) / 3.0;
        System.out.println("Trung binh cua ba so la: " + TB );
        
    }
    
    public static void tong(int a, int b, int c){
        int tong = a + b + c;
        System.out.println("Tong cua ba so la: " + tong);
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    