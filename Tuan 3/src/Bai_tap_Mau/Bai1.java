package Bai_tap_Mau;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		float a,b,c;
		Scanner cin = new Scanner(System.in);
		System.out.println("Nhap canh thu 1:");
		a = cin.nextFloat();
		System.out.println("Nhap canh thu 2:");
		b = cin.nextFloat();
		System.out.println("Nhap canh thu 3:");
		c = cin.nextFloat();
		while((a+b)<c||(a+c)>b||(c+b)>a)
		{
			System.out.println("Cac canh khong phai tam giac yeu cau nhap lai");
			System.out.println("Nhap canh thu 1:");
			a = cin.nextFloat();
			System.out.println("Nhap canh thu 2:");
			b = cin.nextFloat();
			System.out.println("Nhap canh thu 3:");
			c = cin.nextFloat();
		}
		float p = (a+b+c)/2;
		System.out.println("Dien tich tam giac la:"+Math.sqrt(p*(p-a)*(p-b)*(p-c)));
		cin.close();
	}
}
