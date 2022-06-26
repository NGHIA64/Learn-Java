package Dethithuso2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class NhanVien extends ConNguoi {
	private String maNV;
	private String chucVu;
	private ArrayList<PhuThuoc> phuThuocs;

	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVien(String hoTen, LocalDate ngaySinh, Boolean gioiTinh, String maNV, String chucVu,
			ArrayList<PhuThuoc> phuThuocs) {
		super(hoTen, ngaySinh, gioiTinh);
		this.maNV = maNV;
		this.chucVu = chucVu;
		this.phuThuocs = phuThuocs;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public ArrayList<PhuThuoc> getPhuThuocs() {
		return phuThuocs;
	}

	public void setPhuThuocs(ArrayList<PhuThuoc> phuThuocs) {
		this.phuThuocs = phuThuocs;
	}

	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", chucVu=" + chucVu + "]";
	}

	@Override
	public void xuat() {
		System.out.println(this.toString() + " " + super.toString());
		System.out.println("Nhung nguoi phu thuoc la:");
		for (PhuThuoc phuThuoc : phuThuocs) {
			System.out.println(phuThuoc.toString());
		}
	}

	public void nhapdsPT() {
		System.out.println("Nhap so luong phu thuoc");
		int n;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		this.phuThuocs = new ArrayList<PhuThuoc>();
		scanner.nextLine();
		for (int i = 0; i < n; i++) {
			PhuThuoc phuThuoc = new PhuThuoc();
			System.out.println("Nhap ho ten nguoi phu thuoc");
			phuThuoc.setHoTen(scanner.nextLine());
			System.out.println("Nhap tuoi nguoi phu thuoc");
			phuThuoc.setTuoi(scanner.nextInt());
			this.phuThuocs.add(phuThuoc);
			scanner.nextLine();
		}
	}

	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		super.nhap();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ma nhan vien");
		maNV = scanner.nextLine();
		System.out.println("Nhap chuc vu");
		chucVu = scanner.nextLine();
		nhapdsPT();
	}
	public int tuoiTBnguoiPT() {
		int tuoiTB=0;
		for (PhuThuoc phuThuoc : phuThuocs) {
			tuoiTB+=phuThuoc.getTuoi();
		}
		return tuoiTB/phuThuocs.size();
	}
}
