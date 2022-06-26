package Tuan6;

import java.util.Scanner;

public class HoaDon {
	private String maHD;
	private double tongTienHD;
	
	public HoaDon() { }

	public HoaDon(String maHD, double tongTienHD) {
		super();
		this.maHD = maHD;
		this.tongTienHD = tongTienHD;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ma HD: ");
		maHD = sc.next();
		System.out.print("Tong tien HD: ");
		tongTienHD = sc.nextDouble();
	}
	
	public void output() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "HoaDon [maHD=" + maHD + ", tongTienHD=" + tongTienHD + "]";
	}

	public String getMaHD() {
		return maHD;
	}

	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}

	public double getTongTienHD() {
		return tongTienHD;
	}

	public void setTongTienHD(double tongTienHD) {
		this.tongTienHD = tongTienHD;
	}
	
	
}
