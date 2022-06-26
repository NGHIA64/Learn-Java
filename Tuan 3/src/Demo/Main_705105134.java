package Demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_705105134 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		int m;
		System.out.println("Nhap so cac loai dien thoai");
		n = scanner.nextInt();
		while(n<=0)
		{
			System.out.println("Nhap lai");
			n = scanner.nextInt();
		}
		System.out.println("Nhap so luong o to");
		m  = scanner.nextInt();
		while(m<=0)
		{
			System.out.println("Nhap lai");
			m = scanner.nextInt();
		}
		System.out.println("Nhap danh sach dien thoai");
		ArrayList<DienThoai> arrayList1 = new ArrayList<DienThoai>();
		for (DienThoai dienThoai : arrayList1) {
			System.out.println(" Nhap thong tin cho dien thoai ");
			DienThoai thoai = new DienThoai();
			dienThoai.nhap();
			arrayList1.add(dienThoai);
		}
		System.out.println("Nhap danh sach o to");
		ArrayList<Oto> arrayList2 = new ArrayList<Oto>();
		for (Oto oto : arrayList2) {
			System.out.println(" Nhap thong tin cho o to");
			Oto oto2 = new Oto();
			oto2.nhap();
			arrayList2.add(oto2);
		}
		DienThoai tmp = new DienThoai();
		System.out.println("Tong thanh tien cua tat ca cac dien thoai co RAM>4G va ROM>64GB:"+(tmp.tongTien(arrayList1)));
		System.out.println("RAM hd la android va support 5G");
		tmp.hdhAndroidVaht5GB(arrayList1);
		Oto oto = new Oto();
		System.out.println("Oto di tren 10000km va sx tu 2016 la");
		scanner.close();
	}
}
