package Baitap;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		Scanner sc = new Scanner (System.in);
		System.out.print("Nhap ban kinh r: ");
		r = sc.nextInt();
		double chuvi, dientich;
		chuvi = r * 2 * 3.14;
		dientich = r * r * 3.14;
		System.out.print("Duong tron ban kinh r co chu vi la: " + chuvi);
		System.out.print("\nDuong tron ban kinh r co dien tich la: " + dientich);

	}

}
