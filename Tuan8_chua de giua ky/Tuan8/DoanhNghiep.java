package Tuan8;

import java.util.Scanner;

public class DoanhNghiep extends Vaccine{
	private String tenDN;
	private int soLuongVC;
	private String tinhThanh;
	
	public DoanhNghiep() {
		super();
	}
	public DoanhNghiep(String tdn, int slvc, String tt,
			String mvc, String tvc, double g) {
		super(mvc, tvc, g);
		this.tenDN = tdn;
		this.soLuongVC = slvc;
		this.tinhThanh = tt;
	}
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("Tên doanh nghiệp: ");
		this.tenDN = sc.nextLine();
		System.out.print("Số lượng mua: ");
		this.soLuongVC = sc.nextInt();
		System.out.print("Tỉnh thành doanh nghiệp: ");
		sc.nextLine();
		this.tinhThanh = sc.nextLine();
	}
	public void output() {
		System.out.println(this.toString());
	}
	public double tongTien() {
		return this.getGia()*this.soLuongVC;
	}
	@Override
	public String toString() {
		return "DoanhNghiep [tenDN=" + tenDN + ", soLuongVC=" + soLuongVC + ", tinhThanh=" + tinhThanh + ", getMaVC()="
				+ getMaVC() + ", getTenVC()=" + getTenVC() + ", getGia()=" + getGia() + ", tongTien = " + (int)tongTien() + "]";
	}
	public String getTenDN() {
		return tenDN;
	}
	public void setTenDN(String tenDN) {
		this.tenDN = tenDN;
	}
	public int getSoLuongVC() {
		return soLuongVC;
	}
	public void setSoLuongVC(int soLuongVC) {
		this.soLuongVC = soLuongVC;
	}
	public String getTinhThanh() {
		return tinhThanh;
	}
	public void setTinhThanh(String tinhThanh) {
		this.tinhThanh = tinhThanh;
	}
	
}
