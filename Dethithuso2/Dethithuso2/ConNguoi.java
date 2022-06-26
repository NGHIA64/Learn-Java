package Dethithuso2;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Scanner;

public class ConNguoi implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String hoTen;
	private LocalDate ngaySinh;
	private Boolean gioiTinh;

	public ConNguoi() {
		// TODO Auto-generated constructor stub
	}

	public ConNguoi(String hoTen, LocalDate ngaySinh, Boolean gioiTinh) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public Boolean getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(Boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	@Override
	public String toString() {
		String gtinh;
		if (gioiTinh == true) {
			gtinh = "Nam";
		} else {
			gtinh = "Nu";
		}
		return "ConNguoi [hoTen=" + hoTen + ", ngaySinh=" + UtilLcDate.dateToString(ngaySinh) + ", gioiTinh=" + gtinh
				+ "]";
	}

	public void xuat() {
		System.out.println(this.toString());
	}

	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ho ten");
		hoTen = scanner.nextLine();
		System.out.println("Nhap ngay sinh dang dd/MM/yyyy");
		ngaySinh = UtilLcDate.stringToDate(scanner.nextLine());
		while (ngaySinh==null) {
			System.out.println("Nhap lai");
			ngaySinh = UtilLcDate.stringToDate(scanner.nextLine());
		}
		System.out.println("Nhap gioi tinh true-Nam false-Nu");
		gioiTinh = scanner.nextBoolean();
	}

}
