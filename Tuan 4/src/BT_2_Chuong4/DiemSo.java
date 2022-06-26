package BT_2_Chuong4;

import java.util.Scanner;

public class DiemSo extends SinhVien{
	private float dChuyenNganh;
	private float dTuChon;
	private float dTB;
	private String dTBheChu;
	public DiemSo() {
		super();
	}
	public float getdChuyenNganh() {
		return dChuyenNganh;
	}
	public float getdTB() {
		return dTB;
	}
	public String getdTBheChu() {
		return dTBheChu;
	}
	public float getdTuChon() {
		return dTuChon;
	}
	public void setdChuyenNganh(float dChuyenNganh) {
		this.dChuyenNganh = dChuyenNganh;
	}
	public void setdTB(float dTB) {
		this.dTB = dTB;
	}
	public void setdTBheChu(String dTBheChu) {
		this.dTBheChu = dTBheChu;
	}
	public void setdTuChon(float dTuChon) {
		this.dTuChon = dTuChon;
	}
	public void Nhap() {
		super.Nhap();
		Scanner cin = new Scanner(System.in);
		System.out.println("Nhap diem chuyen nganh");
		dChuyenNganh = cin.nextFloat();
		System.out.println("Nhap diem trung binh");
		dTB = cin.nextFloat();
		System.out.println("Nhap diem mon tu chon");
		dTuChon = cin.nextFloat();
		System.out.println("Nhap diem trung binh he chu");
		if(dTB>=8.5)
		{
			dTBheChu = "A";
		}
		else if(dTB>=8)
		{
			dTBheChu = "B+";
		}
		else if(dTB>=7)
		{
			dTBheChu = "B";
		}
		else if(dTB>=6.5)
		{
			dTBheChu = "C+";
		}
		else if(dTB>=5.5)
		{
			dTBheChu = "C";
		}
		else if(dTB>=5) {
			dTBheChu = "D+";
		}
		else if(dTB>=4)
		{
			dTBheChu = "D";
		}
		else
		{
			dTBheChu = "F";
		}
		cin.nextLine();
	}
	public void HienThi() {
		super.HienThi();
		System.out.println("Diem chuyen nganh la:"+(dChuyenNganh));
		System.out.println("Diem mon tu chon la:"+(dTuChon));
		System.out.println("Diem trung binh:"+(dTB));
		System.out.println("Diem trung binh he chu la:"+dTBheChu);
	}
	public void Nhapds(DiemSo[] diemSo)
	{
		for (int i = 0; i < diemSo.length; i++) {
			System.out.println("\nNhap thong tin cho sinh vien thu"+(i+1));
			diemSo[i] = new DiemSo();
			diemSo[i].Nhap();
		}
	}
	public void HienthiDs(DiemSo[] diemSo)
	{
		for (int i = 0; i < diemSo.length; i++) {
			System.out.println("Hien thi thong tin sinh vien thu"+(i+1));
			diemSo[i].HienThi();
		}
	}
	public void sortAvgAsc(DiemSo[] diemSo)
	{
		DiemSo diemSo2 = new DiemSo();
		for (int i = 0; i < diemSo.length; i++) {
			for (int j = i+1; j < diemSo.length; j++) {
				if(diemSo[i].getdTB()<diemSo[j].getdTB())
				{
					diemSo2 = diemSo[i];
					diemSo[i] = diemSo[j];
					diemSo[j] = diemSo2;
				}
			}
		}
	}
	public void diemBp(DiemSo[] diemSo) {
		for (int i = 0; i < diemSo.length; i++) {
			if(diemSo[i].getdTB()>=8)
			{
				diemSo[i].HienThi();
			}
		}
	}
	public void diemDuoi7p5(DiemSo[] diemSo)
	{
		for (int i = 0; i < diemSo.length; i++) {
			if(diemSo[i].getdTB()<=7.5)
			{
				diemSo[i].HienThi();
			}
		}
	}
	public void phoneNum026(DiemSo[] diemSo)
	{
		for (int i = 0; i < diemSo.length; i++) {
			String s = Long.toString(diemSo[i].getSoDT());
			if(s.substring(0, 2).equals("026")==true)
			{
				diemSo[i].HienThi();
			}
		}
	}
	public void iTandd(DiemSo[] diemSo) {
		for (int i = 0; i < diemSo.length; i++) {
			if(diemSo[i].getKhoaQL().equals("CNTT") && diemSo[i].getHoTen().indexOf("d")!=-1)
			{
				diemSo[i].HienThi();
			}
		}
	}
	public void aIndex(DiemSo[] diemSo) {
		for (int i = 0; i < diemSo.length; i++) {
			if(diemSo[i].getHoTen().indexOf("a")!=-1)
			{
				diemSo[i].HienThi();
			}
		}
	}
}
