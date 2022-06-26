package Demo;

import java.util.Scanner;

public class HangHoa {
	private String maHH;
	private String tenHH;
	private int donGia;
	private int soLuong;

	public HangHoa() {
		// TODO Auto-generated constructor stub
	}

	public int getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}

	public String getMaHH() {
		return maHH;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public String getTenHH() {
		return tenHH;
	}

	public void setMaHH(String maHH) {
		this.maHH = maHH;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public void setTenHH(String tenHH) {
		this.tenHH = tenHH;
	}

	public void nhap() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ma hang hoa");
		maHH = scanner.nextLine();
		System.out.println("Nhap ten hang hoa");
		tenHH = scanner.nextLine();
		System.out.println("Nhap don gia");
		donGia = scanner.nextInt();
		System.out.println("Nhap so luong");
		soLuong = scanner.nextInt();
	}

	public void xuat() {
		// TODO Auto-generated method stub
		System.out.println("Ma hang hoa:" + maHH);
		System.out.println("Ten hang hoa:" + tenHH);
		System.out.println("Don gia:" + (donGia));
		System.out.println("So luong:" + (soLuong));
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return maHH + "--" + tenHH + "--" + Integer.toString(donGia) + "--" + Integer.toString(soLuong)+"--";

	}
}
