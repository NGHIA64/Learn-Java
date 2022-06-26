package Bai_tap_Mau;

import java.util.Scanner;

public class Bai12 {
	public static void main(String[] args) {
		int N;
		System.out.println("Nhap So nguyen duong n");
		Scanner cin = new Scanner(System.in);
		N = cin.nextInt();
		while(N<1||N>=Math.pow(10,5))
		{
			System.out.println("Nhap lai");
			N = cin.nextInt();
		}
		int count=0,tmp=N;
		while(tmp>0)
		{
			count++;
			tmp/=10;
		}
		System.out.println("Tong so cac chu so cua N la:"+count);
		if(SNT(N)==true)
		{
			System.out.println("N la so nguyen to");
		}
		else
		{
			System.out.println("N khong phai so nguyen to");
		}
		cin.close();
	}
		public static boolean SNT(int k) {
			int t = (int) Math.sqrt(k);
			if(k==1||k==2)
			{
				return true;
			}
			else
			{
				for (int i = 2; i <= t; i++) {
					if(k%i==0)
					{
						return false;
					}
				}
			}
			return true;
		
	}
}
