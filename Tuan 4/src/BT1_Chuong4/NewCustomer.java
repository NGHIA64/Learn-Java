package BT1_Chuong4;

import java.util.Scanner;

public class NewCustomer extends Customer {
	private boolean kH;

	public NewCustomer() {
		super();
	}

	public boolean iskH() {
		return kH;
	}

	public void setkH(boolean kH) {
		this.kH = kH;
	}

	public void Nhap() {
		Scanner cin = new Scanner(System.in);
		super.Nhap();
		System.out.println(
				"Nhap true hoac 1 neu la khach hang thuong - Nhap 0 hoac false neu khach hang la doanh nghiep");
		this.kH = cin.nextBoolean();
	}

	public void classify() {
		if (this.kH == true) {
			System.out.println("Khach hang la Doanh nghiep");
		} else {
			System.out.println("Khach hang la binh thuong");
		}
	}

	public int getNumDN(NewCustomer[] newCustomers) {
		int dem = 0;
		for (int i = 0; i < newCustomers.length; i++) {
			if (newCustomers[i].iskH() == true) {
				dem++;
			}
		}
		return dem;
	}

	public int getNumKH(NewCustomer[] newCustomers) {
		int dem = 0;
		for (int i = 0; i < newCustomers.length; i++) {
			if (newCustomers[i].iskH() == false) {
				dem++;
			}
		}
		return dem;
	}

	public int soTien(NewCustomer[] newCustomers) {
		if (this.kH == true) {
			if (this.getNumDN(newCustomers) < 100) {
				return 2000 * super.soTien();
			} else {
				return 2500 * super.soTien();
			}
		} else {
			if (this.getNumKH(newCustomers) < 100) {
				return 1234 * super.soTien();
			} else {
				return 1650 * super.soTien();
			}
		}
	}

	public void HienThi(NewCustomer[] newCustomers) {
		super.HienThi();
		System.out.println("Khach hang la:");
		this.classify();
		System.out.println("So tien phai tra la:" + (this.soTien(newCustomers)));
	}

	public static void main(String[] args) {
		System.out.println("Nhap so luong khach hang su dung");
		Scanner cin = new Scanner(System.in);
		int n;
		n = cin.nextInt();
		NewCustomer[] newCustomers = new NewCustomer[n];
		System.out.println("Nhap thong tin cac Khach hang");
		for (int i = 0; i < newCustomers.length; i++) {
			System.out.println("Nhap thong tin cho khach hang thu" + (i + 1));
			newCustomers[i] = new NewCustomer();
			newCustomers[i].Nhap();
		}
		System.out.println("Hien thi thong tin khach hang va tien nuoc");
		for (int i = 0; i < newCustomers.length; i++) {
			newCustomers[i].HienThi(newCustomers);
		}
		NewCustomer tmp = new NewCustomer();
		System.out.println("So khach hang la doanh nghiep la " + tmp.getNumDN(newCustomers));
	}
}
