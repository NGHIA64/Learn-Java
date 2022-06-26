package Demo;
//dung ham nhap mang xuat mang
import java.util.Iterator;
import java.util.Scanner;

public class Sinhvien {
	public String name;
	public String lop;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so sinh vien: ");
		int n = sc.nextInt();
		Sinhvien[] sv = new Sinhvien[n];
		nhapmang(sv, n);
		xuatmang(sv, n);
		
		
	}
	public Sinhvien() {
		
		
	}
	public Sinhvien(String name, String lop) {
		this.name = name;
		this.lop = lop;
	}
	public void nhapdl() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten: ");
		name = sc.nextLine();
		System.out.print("Lop: ");
		lop = sc.nextLine();
		
		
	}
	
	@Override
	public String toString() {
		return "\nTen sinh vien: " + name + "\nLop: " + lop;
	}
	public void hienthi() {
		System.out.print(this.toString());
	}
	public static void nhapmang(Sinhvien[] sv, int n) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < n; i++) {
			 sv[i] = new Sinhvien();
			 sv[i].nhapdl();
			 
		}
	}
	public static void xuatmang(Sinhvien[] sv, int n) {
		for(int i = 0; i < n; i++) {
			 
			 sv[i].hienthi();
			 
		}
	}
}
