package Demo;

import java.util.Iterator;
import java.util.Scanner;

public class Mang_1_chieu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[100];
		System.out.print("Nhap so luong phan tu: ");
		int n = sc.nextInt();
		double tb = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]= ");
			a[i] = sc.nextInt();
			tb += a[i];
		}
		System.out.println("Mang ban vua nhap la: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
			
		}
		System.out.print("\nMang co gia tri trung binh la: " + (tb / n));
		System.out.println("\nCac phan tu co vi tri chia het cho 3 se nhan doi: ");
		for (int i = 0; i < n; i++) {
			if ((i+1) % 3 == 0) {
				a[i] = a[i] * 2;
				
			}
			System.out.print(a[i] + " ");
		}
	}

}
