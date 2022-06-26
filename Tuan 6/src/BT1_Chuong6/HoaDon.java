package BT1_Chuong6;

import java.util.Scanner;

public class HoaDon {
	private String maHD;
	private int tongTien;

	public HoaDon() {
		// TODO Auto-generated constructor stub
	}

	public String getMaHD() {
		return maHD;
	}

	public int getTongTien() {
		return tongTien;
	}

	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}

	public void setTongTien(int tongTien) {
		this.tongTien = tongTien;
	}

//	public void inPut() {
//		Scanner scanner = new Scanner(System.in);
//		this.setMaHD(scanner.nextLine());
//		this.setTongTien(scanner.nextInt());
//	}
	public void outPut() {
		System.out.println("Ma hoa don:" + this.maHD);
		System.out.println("Tong so tien:" + this.tongTien);
	}
}
