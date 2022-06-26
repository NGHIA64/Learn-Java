package Baitap;

import java.util.Scanner;

public class Bai8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chuoi muon kiem tra: ");
		String chuoi = sc.nextLine();
		int kiemtra = 0;
		for(int i = 0; i < chuoi.length(); i++) {
			if (chuoi.charAt(i) >= '0' && chuoi.charAt(i) <= '9') {
				kiemtra += 1;
			}
		}
		if (kiemtra > 0) {
			System.out.println("Chuoi chua chu so!");
		} else {
			System.out.println("Chuoi khong chua chu so");
		}
		

	}

}
