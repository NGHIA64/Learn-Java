package Baitap;

import java.util.Iterator;
import java.util.Scanner;

public class Bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chuoi can dao nguoc: ");
		String chuoi = sc.nextLine();
		System.out.println("Chuoi nay co: " + chuoi.length() +" ki tu");
		String daonguoc = "";
		for(int i = chuoi.length() - 1; i >= 0; i--) {
			//System.out.println(i--);
			daonguoc = daonguoc + chuoi.charAt(i);
		}
		System.out.println("Chuoi dao nguoc la: " + daonguoc);
	}

}
