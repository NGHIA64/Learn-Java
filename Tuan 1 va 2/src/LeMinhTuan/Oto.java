package LeMinhTuan;

import java.util.ArrayList;
import java.util.Scanner;

public class Oto extends HangHoa{
	private int namSX;
	private String hangSX;
	private boolean hopSo;
	private int soKMdadi;
	private int maLuc;
	private String mausac;
	public Oto() {
		// TODO Auto-generated constructor stub
		super();
	}
	public void setNamSX(int namSX) {
		this.namSX = namSX;
	}
	public void setHopSo(boolean hopSo) {
		this.hopSo = hopSo;
	}
	public void setMaLuc(int maLuc) {
		this.maLuc = maLuc;
	}
	public void setSoKMdadi(int soKMdadi) {
		this.soKMdadi = soKMdadi;
	}
	public void setMausac(String mausac) {
		this.mausac = mausac;
	}
	public void setHangSX(String hangSX) {
		this.hangSX = hangSX;
	}
	public String getHangSX() {
		return hangSX;
	}
	public int getMaLuc() {
		return maLuc;
	}
	public String getMausac() {
		return mausac;
	}
	public int getNamSX() {
		return namSX;
	}
	public int getSoKMdadi() {
		return soKMdadi;
	}
	public boolean isHopSo() {
		return hopSo;
	}
	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		super.nhap();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap nam sanxuat");
		namSX = scanner.nextInt();
		System.out.println("Nhap So km da di");
		soKMdadi = scanner.nextInt();
		System.out.println("Nhap ma luc");
		maLuc = scanner.nextInt();
		System.out.println("Nhap thong tin ve hop so true la so san con false la tu dong");
		hopSo = scanner.nextBoolean();
		scanner.nextLine();
		System.out.println("Nhap hang san xuat");
		hangSX = scanner.nextLine();
		System.out.println("Nhap mau sac");
		mausac = scanner.nextLine();
	}
	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		super.xuat();
		System.out.println("Hang SX:"+hangSX);
		System.out.println("Mau sac:"+mausac);
		System.out.println("Ma luc"+(maLuc));
		System.out.println("Nam SX:"+(namSX));
		System.out.println("So km da di:"+(soKMdadi));
		if(hopSo==true)
		{
			System.out.println("So san");
		}
		else
		{
			System.out.println("Tu dong");
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" "+hangSX+" "+mausac+" "+"NSX:"+Integer.toString(namSX)+" ";
	}
	private void otoTren1000km(ArrayList<Oto> arrayList) {
		// TODO Auto-generated method stub
		for (Oto oto : arrayList) {
			if(oto.getNamSX()>=2016 && oto.getSoKMdadi()>10000)
			{
				oto.xuat();
			}
		}
	}
}
