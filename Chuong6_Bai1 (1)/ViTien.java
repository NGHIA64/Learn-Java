package Tuan6;

import java.util.Scanner;

public class ViTien {
	private String maVT;
	private double tongTienVi;
	
	public ViTien() { }

	public ViTien(String maVT, double tongTienVi) {
		super();
		this.maVT = maVT;
		this.tongTienVi = tongTienVi;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ma VT: ");
		maVT = sc.next();
		System.out.print("Tong tien trong vi: ");
		tongTienVi = sc.nextDouble();
	}
	
	public void output() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "ViTien [maVT=" + maVT + ", tongTienVi=" + tongTienVi + "]";
	}

	public String getMaVT() {
		return maVT;
	}

	public void setMaVT(String maVT) {
		this.maVT = maVT;
	}

	public double getTongTienVi() {
		return tongTienVi;
	}

	public void setTongTienVi(double tongTienVi) {
		this.tongTienVi = tongTienVi;
	}
	
	
}
