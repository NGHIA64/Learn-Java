package Bai_Tap;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a: ");
		int a = sc.nextInt();
		System.out.print("Nhap b: ");
		int b = sc.nextInt();
		System.out.print("Nhap c: ");
		int c = sc.nextInt();
		if (a < b + c && b < a + c && c < a + b) {
			System.out.print("Day la 3 canh cua tam giac!!");
			double p = (a + b + c) / 2;
			double s = Math.sqrt(p * (p -a) * (p - b) * (p -c));
			System.out.print("\nDien tich tam giac la: " + s);
		}
		else {
			System.out.print("Day khong la 3 canh cua tam giac");;
		}
	}

}
