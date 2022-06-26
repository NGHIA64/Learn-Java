package Bai_tap_Mau;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		long A = 0;
		int n;
		Scanner cin = new Scanner(System.in);
		System.out.println("Nhap so nguyen duong n");
		n = cin.nextInt();
		for (int i = 1; i <= n; i++) {
			A += factorial(i);
		}
		System.out.println("Gia tri cua bieu thuc can tinh theo de bai la:" + A);
		cin.close();
	}

	public static long factorial(int k) {
		if (k == 1) {
			return 1;
		} else {
			return k * factorial(k - 1);
		}
	}
}
