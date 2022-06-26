package Bai_tap_Mau;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		double A,A1,A2,phil1,phil2;
		Scanner cin = new Scanner(System.in);
		System.out.println("Nhap A1:");
		A1 = cin.nextFloat();
		System.out.println("Nhap A2:");
		A2 = cin.nextFloat();
		System.out.println("Nhap phil1");
		phil1 = cin.nextFloat();
		System.out.println("Nhap phil2");
		phil2 = cin.nextFloat();
		A = Math.pow(A1, 2) + Math.pow(A2,2) + Math.cos(phil1-phil2);
		System.out.println("Gia tri cua bieu thuc A = A1^2+A2^2+cos(phil1-phil2) la:"+A);
		cin.close();
	}
}
