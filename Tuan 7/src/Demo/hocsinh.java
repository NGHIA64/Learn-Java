package Demo;

import java.util.ArrayList;
import java.util.Scanner;

public class hocsinh extends Person {
	int diem;
	
	public hocsinh() {
		// TODO Auto-generated constructor stub
		super();
	}
	public hocsinh(int diem) {
		// TODO Auto-generated constructor stub
		super();
		this.diem = diem;
	}
	@Override
	public void nhapdl() {
		// TODO Auto-generated method stub
		super.nhapdl();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap diem: ");
		diem = sc.nextInt();
	}
	@Override
	public void hienthi() {
		// TODO Auto-generated method stub
		super.hienthi();
		System.out.print("\nDiem: " + diem);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<hocsinh> hs = new ArrayList<>();
		System.out.print("Nhap so hoc sinh: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			hocsinh t = new hocsinh();
			t.nhapdl();
			hs.add(t);
		}
		System.out.println("Hoc sinh da nhap la: ");
		for (hocsinh hocsinh : hs) {
			hocsinh.hienthi();
		}
	}

}
