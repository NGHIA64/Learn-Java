package Bai_tap_Mau;

import java.util.Scanner;

public class bai3_1 {
	public static void main(String[] args) {
		int n;
		Scanner cin = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang");
		n = cin.nextInt();
		int[] Array= new int[n];
		System.out.println("Nhap cac phan tu cua day so");
		int dem = Array.length;
		for(int i=0;i<Array.length;i++)
		{
			System.out.println("a["+i+"]:");
			Array[i] = cin.nextInt();
		}
		int Sum = 0;
		for(int i=0;i<Array.length;i++)
		{
			Sum+=Array[i];
		}
		double tmp = Sum;
		System.out.println("Gia tri trung binh cua mang la: "+(tmp/dem));
		int[] a = new int[n]; 
		for(int i=0;i<dem;i++)
		{
			a[i] = Array[i];
		}
		for(int i=0;i<dem;i++)
		{
			if((i+1)%3==0)
			{
				a[i]*=2;
			}
		}
		System.out.println("Mang sau khi nhan la :");
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println("\nMang trc khi nhan la :");
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i]+" ");
		}
		cin.close();
	}
}
