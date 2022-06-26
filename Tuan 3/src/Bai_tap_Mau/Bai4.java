package Bai_tap_Mau;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		float a,b,c;
		Scanner cin = new Scanner(System.in);
		System.out.println("Nhap he so cho phuong trình bac 2: a*x^2+b*x+c=0");
		System.out.println("Nhap he so a");
		a = cin.nextFloat();
		System.out.println("Nhap he so b");
		b = cin.nextFloat();
		System.out.println("Nhap he so c");
		c = cin.nextFloat();
		float delta = b*b-4*a*c;
		if(delta<0)
		{
			System.out.println("Phuong trinh vo nghiem");

		}
		else if(delta == 0)
		{
			System.out.println("Phuong trinh co nghiem duy nhat la:"+-b/(2*a));
		}
		else
		{
			System.out.println("Phuong trinh co 2 nghiem");
			System.out.println("x1="+((-b+Math.sqrt(delta))/(2*a)));
			System.out.println("x2="+((-b-Math.sqrt(delta))/(2*a)));
		}
		cin.close();
	}
}
