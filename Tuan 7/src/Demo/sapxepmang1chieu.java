package Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class sapxepmang1chieu {
	
	public static void main(String[] args) {
		int[] a = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		//System.out.println(a.length - 1);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
	System.out.println("Mang vua nhap la: ");
	for (int i : a) {
		System.out.print(i + " ");
	}
	System.out.println("\nNhap phan tu can tim: ");
	int k = sc.nextInt();
	
	for(int i = 0; i < n; i++) {
		if (k == a[i]) {
			System.out.println(k + " o vi tri " + i);
		}
	}
	for(int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (a[i] < a[j]) {
				int max = a[i];
				a[i]= a[j];
				a[j]= max;
			}
		}
	}
	System.out.println("Mang vua sap xep la: ");
	
	for (int i : a) {
		System.out.print(i + " ");
	}
	
	}
	
}
