package Baitap;

import java.util.Scanner;

public class Bai1 {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Nhap a: ");
		int a = Bai1.scanner.nextInt();
		System.out.print("Nhap b: ");
		int b = Bai1.scanner.nextInt();
		System.out.print("Nhap c: ");
		int c = Bai1.scanner.nextInt();
		System.out.println("Ban vua nhap 3 so " + a +" , " + b + " va " + c);
		Bai1.max(a, b, c);
		Bai1.tb(a, b, c);
	}
	public static void max(int a, int b, int c) {
			int max = a;
			if (max < b) {
				max = b;
			}
			if (max < c) {
				max = c;
			}
			System.out.print(max + " la so lon nhat!");
		
	}
	
	public static void tb(int a, int b, int c) {
		double tb;
		int tong;
		tong = a + b + c;
		tb = (a + b + c) / 3.0;
		System.out.print("\nGia tri trung binh cua 3 so la: " + tb);
		System.out.print("\nTong 3 so vua nhap la: " + tong);
				
	}
		

	

}


