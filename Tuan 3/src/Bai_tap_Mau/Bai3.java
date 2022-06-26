package Bai_tap_Mau;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		int N;
		float S=0;
		Scanner cin = new Scanner(System.in);
		System.out.println("Nhap so nguyen N:");
		N = cin.nextInt();
		for (int i = 1; i <= N; i++) {
			S+=Math.pow(i, 2);
		}
		System.out.println("Gia tri cua S la:"+Math.sqrt(S));
		cin.close();
	}
}
