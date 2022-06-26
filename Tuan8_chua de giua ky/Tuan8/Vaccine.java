package Tuan8;

import java.util.Scanner;

public class Vaccine {
	private String maVC;
	private String tenVC;
	private double gia;
	
	public Vaccine() { }
	public Vaccine(String mvc, String tvc, double g) {
		this.maVC = mvc;
		this.tenVC = tvc;
		this.gia = g;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập mã vaccine: ");
		this.maVC = sc.next();
		System.out.print("Nhập tên vaccine: ");
		sc.nextLine();
		this.tenVC = sc.nextLine();
		System.out.print("Nhập giá vaccine: ");
		this.gia = sc.nextDouble();
	}
	public void output() {
		System.out.println(this.toString());
	}
	@Override
	public String toString() {
		return "Vaccine [maVC=" + maVC + ", tenVC=" + tenVC + ", gia=" + gia + "]";
	}
	public String getMaVC() {
		return maVC;
	}
	public void setMaVC(String maVC) {
		this.maVC = maVC;
	}
	public String getTenVC() {
		return tenVC;
	}
	public void setTenVC(String tenVC) {
		this.tenVC = tenVC;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	

}
