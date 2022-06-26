package Bai_tap_Mau;

import java.util.Scanner;

public class Bai8 {
	public static void main(String[] args) {
		float DTB;
		System.out.println("Nhap diem trung binh cua sinh vien");
		Scanner cin = new Scanner(System.in);
		DTB = cin.nextFloat();
		while(DTB<0||DTB>10)
		{
			System.out.println("Yeu cau nhap lai");
			DTB = cin.nextFloat();
		}
		System.out.print("Xep loai:");
		if(DTB>=8.5)
		{
			System.out.println("A");
		}
		else if(DTB<=8.4 && DTB>=8)
		{
			System.out.println("B+");
		}
		else if(DTB<=7.9 && DTB >=7)
		{
			System.out.println("B");
		}
		else if(DTB<=6.9 && DTB >=6.5)
		{
			System.out.println("C+");
		}
		else if (DTB<=6.4 && DTB >= 5.5) {
			System.out.println("C");
			
		}
		else if (DTB<=5.4 && DTB>=5.0) {
			System.out.println("D+");
		}
		else if(DTB<=4.9 && DTB>=4.0)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}
		cin.close();
	}
}
