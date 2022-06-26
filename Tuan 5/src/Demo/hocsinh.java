package Demo;//nhap bang arraylisst
 

import java.util.ArrayList;
import java.util.Scanner;


public class hocsinh {
	public static void main(String[] args) {
		ArrayList< hocsinh> hs = new ArrayList<>();
		hocsinh h;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			h = new hocsinh();
			h.in();
			hs.add(h);
		}
		for (int i = 0; i < n; i++) {
			hs.get(i).out();
		}
		
	}
	private String diachi;
	private String ten;
	
	

	public hocsinh() {
		ten = diachi = "";
	}
	public void in() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten: ");
		ten = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		diachi = sc.nextLine();
		
	}
	public void out() {
		System.out.print(this.toString());
	}
	@Override
	public String toString() {
		return "hocsinh [ten=" + ten + ", diachi=" + diachi + "]";
	}
}
