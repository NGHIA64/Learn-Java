package Bai_tap_Mau;

import java.util.Scanner;

public class Bai13 {
	public static void main(String[] args) {
		int n;
		Scanner cin = new Scanner(System.in);
		System.out.println("Nhap gia tri nguyen duong cho n");
		n = cin.nextInt();
		while (n < 1) {
			System.out.println("Nhap lai");
			n = cin.nextInt();
		}
		System.out.println("S="+SnSqrt3(n));
		cin.close();
	}

	public static double SnSqrt3(int n)
	{
		if(n==1)
		{
			return Math.sqrt(3);
		}
		else return Math.sqrt(3+SnSqrt3(n-1));
	}

}
