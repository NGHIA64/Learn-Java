package BT1_Chuong4;

import java.util.Scanner;

public class Customer {
	private String hoTenChuho;
	private String diaChi;
	private int soCToThTrc;
	private int soCToThNay;

	public Customer() {
		super();
	}

	public String getHoTenChuho() {
		return hoTenChuho;
	}

	public void hoTenChuho(String hoTenChuho) {
		this.hoTenChuho = hoTenChuho;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public int getSoCToThTrc() {
		return soCToThTrc;
	}

	public void setSoCToThTrc(int soCToThTrc) {
		this.soCToThTrc = soCToThTrc;
	}

	public int getSoCToThNay() {
		return soCToThNay;
	}

	public void setSoCToThNay(int soCToThNay) {
		this.soCToThNay = soCToThNay;
	}

	public Customer(String hoTenChuho, String diaChi, int soCToThTrc, int soCToThNay) {
		this.hoTenChuho = hoTenChuho;
		this.diaChi = diaChi;
		this.soCToThTrc = soCToThTrc;
		this.soCToThNay = soCToThNay;
	}

	public void Nhap() {
		Scanner cin = new Scanner(System.in);
		System.out.println("Nhap ho ten chu ho:");
		this.hoTenChuho = cin.nextLine();
		System.out.println("Nhap dia chi:");
		this.diaChi = cin.nextLine();
		System.out.println("Nhap so cong to thang truoc");
		this.soCToThTrc = cin.nextInt();
		System.out.println("Nhap so cong to thang nay");
		this.soCToThNay = cin.nextInt();
		cin.nextLine();
	}

	public int soTien() {
		return (this.soCToThNay - this.soCToThTrc);
	}

	public void HienThi() {
		System.out.println("Ten chu ho:" + hoTenChuho);
		System.out.println("Dia chi:" + diaChi);
	}
}
