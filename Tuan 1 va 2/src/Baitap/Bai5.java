package Baitap;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ki tu: ");
		String kitu = sc.nextLine().substring(0,1);
		char viethoa = kitu.charAt(0);
		int aci = viethoa;
		System.out.println("Chu viet hoa va Ma ACCII la: " + kitu.toUpperCase() + " - " + aci);
	}

}
