package thuthi;

import java.util.Date;
import java.util.Scanner;

public class Phu_Thuoc {
	private String hoten;
	private Date Ngaysinh;
	private String gioitinh;
	public Phu_Thuoc() {
		// TODO Auto-generated constructor stub		
	}
	public Phu_Thuoc(String hoten, Date Ngaysinh, String gioitinh) {
		this.hoten = hoten;
		this.Ngaysinh=Ngaysinh;
		this.gioitinh = gioitinh;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public Date getNgaysinh() {
		return Ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		Ngaysinh = ngaysinh;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public void nhapdl() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		hoten = sc.nextLine();
		System.out.print("Nhap ngay sinh: ");
		Ngaysinh = sc.nextLine();
		System.out.print();
		System.out.print();
		
	}
	
	
	
}
