package Bai_Tap;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap A1: ");
		int a1 = sc.nextInt();
		System.out.print("Nhap A2: ");
		int a2 = sc.nextInt();
		System.out.print("Nhap phi1: ");
		int p1 = sc.nextInt();
		System.out.print("Nhap phi2: ");
		int p2 = sc.nextInt();
		double a = Math.pow(a1, 2) + Math.pow(a2, 2) + 2 * a1 * a2 * Math.cos(p1 -p2);
		System.out.print("A =" + a);
		
	}

}
