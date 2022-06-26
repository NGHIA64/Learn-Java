package Bai_tap_Mau;

import java.util.Scanner;

public class Bai9 {
	public static void main(String[] args) {
		long S=0;
		int n;
		Scanner cin = new Scanner(System.in);
		System.out.println("Nhap so nguyen duong n");
		n = cin.nextInt();
		while(n<1)
		{
			System.out.println("Nhap lai");
			n = cin.nextInt();
		}
		for (int i = 1; i <= n; i++) {
			S+=i;
		}
		System.out.println("S(n)="+S);
		cin.close();
	}
}
