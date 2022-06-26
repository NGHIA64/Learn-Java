package Baitap;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Nhap canh dai a: ");
		int a = sc.nextInt();
		System.out.print("Nhap canh dai b: ");
		int b = sc.nextInt();
		System.out.print("Nhap canh dai c: ");
		int c = sc.nextInt();
		Bai3.kiemtra(a, b, c);
		
	}
	static void kiemtra(int a, int b, int c){
		
		if (a < b + c && b < a + c && c < a + b) {
			System.out.println("Day la 3 canh cua tam giac!!");
			float chuvi = (float) (a + b + c)/2;
			System.out.println("Tam giac co chu vi la: " + (a + b + c));
			float dientich = (float) (a * 0.5 * ((2 * (Math.sqrt(chuvi * (chuvi - a) * (chuvi - b) * (chuvi - c)))) / a));
			System.out.println("Tam giac co dien tich la: " + dientich);
		}
		else {
			System.out.println("Day khong la 3 canh cua tam giac!!");
		}
	}
	

}
