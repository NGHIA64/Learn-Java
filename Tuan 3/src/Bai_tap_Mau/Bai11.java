package Bai_tap_Mau;

import java.util.Scanner;

public class Bai11 {
	public static void main(String[] args) {
		long S=0;
		int n;
		float x;
		Scanner cin = new Scanner(System.in);
		System.out.println("Nhap so nguyen duong n");
		n = cin.nextInt();
		while(n<1)
		{
			System.out.println("Nhap lai");
			n = cin.nextInt();
		}
		System.out.println("Nhap gia tri cho x");
		x = cin.nextFloat();
		for (int i = 1; i <= n; i++) {
			int tmp = (int) Math.pow(x*2*i,i);
			S+=tmp;
		}
		System.out.println("S(n)="+S);
		cin.close();
	}
}
