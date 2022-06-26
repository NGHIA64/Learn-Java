package LeMinhTuan;

import java.util.ArrayList;
import java.util.Scanner;

public class DienThoai extends HangHoa {
	private String heDH;
	private int dungLuongPin;
	private int dungLuongRAM;
	private int dungLuongROM;
	private boolean supp5g;

	public DienThoai() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	public int getDonGia() {
		// TODO Auto-generated method stub
		return super.getDonGia();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public String getHeDH() {
		return heDH;
	}

	public int getDungLuongPin() {
		return dungLuongPin;
	}

	public int getDungLuongRAM() {
		return dungLuongRAM;
	}

	public int getDungLuongROM() {
		return dungLuongROM;
	}

	public boolean isSupp5g() {
		return supp5g;
	}

	public void setHeDH(String heDH) {
		this.heDH = heDH;
	}

	public void setDungLuongPin(int dungLuongPin) {
		this.dungLuongPin = dungLuongPin;
	}

	public void setDungLuongRAM(int dungLuongRAM) {
		this.dungLuongRAM = dungLuongRAM;
	}

	public void setDungLuongROM(int dungLuongROM) {
		this.dungLuongROM = dungLuongROM;
	}

	public void setSupp5g(boolean supp5g) {
		this.supp5g = supp5g;
	}

	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		super.nhap();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap dung luong pin:");
		dungLuongPin = scanner.nextInt();
		System.out.println("Nhap dung luong RAM");
		dungLuongRAM = scanner.nextInt();
		System.out.println("Nhap dung luong ROM");
		dungLuongROM = scanner.nextInt();
		System.out.println("Nhap true neu co support 5G nguoc lai nhap false");
		this.supp5g = scanner.nextBoolean();
		while (this.supp5g != true && this.supp5g != false) {
			System.out.println("Nhap lai");
			this.supp5g = scanner.nextBoolean();
		}
		scanner.nextLine();
		System.out.println("Nhap he dieu hanh");
		heDH = scanner.nextLine();
	}

	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		super.xuat();
		System.out.println("He dieu hanh:" + heDH);
		System.out.println("Dung luong pin:" + (dungLuongPin) + " mAH");
		System.out.println("Dung luong RAM:" + (dungLuongRAM) + "GB");
		System.out.println("Dung luong ROM:" + (dungLuongROM) + "GB");
		if (isSupp5g() == true) {
			System.out.println("Co ho tro 5G");
		} else {
			System.out.println("Khong ho tro 5G");
		}
	}

	public String toString() {
		return super.toString() + " " + Integer.toString(dungLuongPin) + "mAh" + " " + Integer.toString(dungLuongRAM)
				+ "GB" + " " + Integer.toString(dungLuongROM) + " GB " + " " + heDH;
	}
	public int tongTien(ArrayList<DienThoai> arrayList) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (DienThoai dienThoai : arrayList) {
			if(dienThoai.getDungLuongRAM()>4 && dienThoai.getDungLuongROM()>64)
			{
				sum+=dienThoai.getDonGia()*dienThoai.getSoLuong();
			}
		}
		return sum;
	}
	public void hdhAndroidVaht5GB(ArrayList<DienThoai> arrayList ) {
		// TODO Auto-generated method stub
		for (DienThoai dienThoai : arrayList) {
			if(dienThoai.getHeDH().equals("Androids")==true && dienThoai.supp5g==true)
			{
				dienThoai.xuat();
			}
		}
	}
}
