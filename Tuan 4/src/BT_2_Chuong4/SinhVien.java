package BT_2_Chuong4;

import java.util.Scanner;

public class SinhVien {
	private String MSV;
	private String hoTen;
	private int namSinh;
	private String email;
	private long soDT;
	private String khoaQL;
	private String KhoaDT;
	private String lop;
	public SinhVien()
	{
		super();
	}
	public String getMSV() {
		return MSV;
	}
	public void setMSV(String mSV) {
		MSV = mSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public long getSoDT() {
		return soDT;
	}
	public void setSoDT(long soDT) {
		this.soDT = soDT;
	}
	public String getKhoaDT() {
		return KhoaDT;
	}
	public void setKhoaDT(String khoaDT) {
		KhoaDT = khoaDT;
	}
	public String getKhoaQL() {
		return khoaQL;
	}
	public void setKhoaQL(String khoaQL) {
		this.khoaQL = khoaQL;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public void Nhap()
	{
		Scanner cin = new Scanner(System.in);
		System.out.println("Nhap MSV");
		MSV = cin.nextLine();
		System.out.println("Nhap Ho Ten:");
		hoTen = cin.nextLine();
		System.out.println("Nhap nam sinh");
		namSinh = cin.nextInt();
		cin.nextLine();
		System.out.println("Nhap email:");
		email = cin.nextLine();
		System.out.println("Nhap so dien thoai:");
		soDT = cin.nextLong();
		cin.nextLine();
		System.out.println("Nhap khoa quan ly:");
		khoaQL = cin.nextLine();
		System.out.println("Nhap khoa dao tao:");
		KhoaDT = cin.nextLine();
		System.out.println("Nhap ten lop:");
		lop = cin.nextLine();
	}
	public void HienThi() {
		System.out.println("MSV la:"+this.MSV);
		System.out.println("Ho ten la:"+this.hoTen);
		System.out.println("Nam sinh:"+this.namSinh);
		System.out.println("Email:"+this.email);
		System.out.println("So DT"+this.soDT);
		System.out.println("Khoa quan ly:"+this.khoaQL);
		System.out.println("Khoa dao tao:"+this.KhoaDT);
		System.out.println("Ten lop:"+this.lop);
	}
}
