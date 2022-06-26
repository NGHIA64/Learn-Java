package btonluyen1;

import java.util.Scanner;

public class NewCustemer extends Customer{
	private String kiemtra;
	public NewCustemer() {
		super();
	}
	
	public String getKiemtra() {
		return kiemtra;
	}

	public void setKiemtra(String kiemtra) {
		this.kiemtra = kiemtra;
	}
	public void input() {
		super.nhapdl();
		Scanner sc = new Scanner(System.in);
		System.out.print("Khach hang co la khach hang doanh nghiep khong?");
		kiemtra = sc.nextLine();
		
	}
	public void kt() {
		if (kiemtra == "co") {
			System.out.print("\nKhach hang la khach hang doanh nghiep");
		}
		else {
			System.out.print("\nKhach hang khong la khach hang doanh nghiep");
		}
	}
	public void output() {
		super.hienthi();
		this.kt();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so khach hang: ");
		int n = sc.nextInt();
		sc.nextLine();
		NewCustemer[] kh = new NewCustemer[n];
		for (int i = 0; i < kh.length; i++) {
			kh[i] = new NewCustemer();
			kh[i].input();
		}
		for (int i = 0; i < kh.length; i++) {
			
			kh[i].output();
			System.out.println();
		}
		
		
	}

}
