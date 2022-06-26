package Bai_Tap;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a: ");
		int a = sc.nextInt();
		System.out.print("Nhap b: ");
		int b = sc.nextInt();
		System.out.print("Nhap c: ");
		int c = sc.nextInt();
		double delta = Math.pow(b, 2)- 4 * a * c;
		if (delta < 0) {
			System.out.print("Pt vo nghiem.");
			
		} else {
			if (delta == 0) {
				int x = 0;
				x = - b / (2 *a);
				System.out.print("Pt co 1 nghiem." + x);
			
			} else {
				double x1 = 0;
				double x2 = 0;
				x1 = - b / Math.sqrt(delta*2 *a);
				x2 = b / Math.sqrt(delta*2 *a);
				System.out.print("Pt co 1 nghiem." + x1);
				System.out.print("Pt co 1 nghiem." + x2);
			}

		}
	}

}
