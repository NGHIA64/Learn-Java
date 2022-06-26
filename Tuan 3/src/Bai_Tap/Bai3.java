package Bai_Tap;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap N: ");
		int n = sc.nextInt();
		int s = 0;
		for (int i = 1; i < n + 1; i++) {
			s += Math.pow(i, 2);
		}
		System.out.print("S = " + Math.sqrt(s));
		}

}
