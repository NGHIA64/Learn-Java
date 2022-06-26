package btonluyen1;

import java.util.Scanner;


public class Customer {
	
	private String hoten;
	private String diachi;
	private int socongtotc;
	private int socongtotn;
	public Customer() {
		
	}
	public Customer(String hoten, String diachi, int socongtotc, int socongtotn) {
		this.hoten=hoten;
		this.diachi = diachi;
		this.socongtotc = socongtotc;
		this.socongtotn =socongtotn;
	}
	public void nhapdl() {
		Scanner sc = new Scanner(System.in);
		
			System.out.print("Nhap ho ten khach hang: ");
			hoten = sc.nextLine();
			
			System.out.print("Nhap dia chi khach hang: ");
			diachi = sc.nextLine();
			System.out.print("Nhap so cong to thang truoc: ");
			socongtotc = sc.nextInt();
			System.out.print("Nhap so cong to thang nay: ");
			socongtotn = sc.nextInt();
			sc.nextLine();
			
		
		
		
		
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public int getSocongtotc() {
		return socongtotc;
	}
	public void setSocongtotc(int socongtotc) {
		this.socongtotc = socongtotc;
	}
	public int getSocongtotn() {
		return socongtotn;
	}
	public void setSocongtotn(int socongtotn) {
		this.socongtotn = socongtotn;
	}
	public void hienthi() {
		System.out.print(this.toString());
	}
	@Override
	public String toString() {
		return "Ho ten khach hang: " + hoten + "\nDia chi khach hang: " + diachi + "\nSo cong to thang truoc: " + socongtotc 
				+ "\nSo cong to thang nay: " + socongtotn + "\nSo cong to da dung: " + (socongtotn - socongtotc) * 1234;
	}
	
	
	

}
