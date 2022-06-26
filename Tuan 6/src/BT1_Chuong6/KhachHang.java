package BT1_Chuong6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class KhachHang {
	private String maKH;
	private String hoTen;
	private int soCMND;
	private Date date;
	private int viTien;
	HoaDon[] hoaDons;

	public int getViTien() {
		return viTien;
	}

	public void setViTien(int viTien) {
		this.viTien = viTien;
	}

	public KhachHang() {
		// TODO Auto-generated constructor stub
	}

	public Date getDate() {
		return date;
	}

	public HoaDon[] getHoaDons() {
		return hoaDons;
	}

	public String getHoTen() {
		return hoTen;
	}

	public String getMaKH() {
		return maKH;
	}

	public int getSoCMND() {
		return soCMND;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void setHoaDons(HoaDon[] hoaDons) {
		this.hoaDons = hoaDons;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public void setSoCMND(int soCMND) {
		this.soCMND = soCMND;
	}

	public void dateInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap theo dinh dang dd/MM/yyyy!");
		String s = scanner.nextLine();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.date = dateFormat.parse(s);
		} catch (ParseException e) {
			System.out.println("De nghi nhap dung dinh dang");
			this.dateInput();
		}
	}

	public void hoaDonInput() {
		int n;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		this.hoaDons = new HoaDon[n];
		scanner.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin cho hoa don thu " + (i + 1));
			HoaDon hoaDon = new HoaDon();
			System.out.println("Nhap ma hoa don");
			hoaDon.setMaHD(scanner.nextLine());
			System.out.println("Nhap tong so tien");
			hoaDon.setTongTien(scanner.nextInt());
			this.hoaDons[i] = hoaDon;
			scanner.nextLine();
		}
	}

	public void inPut() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ma khach hang");
		this.setMaKH(scanner.nextLine());
		System.out.println("Nhap ho ten:");
		this.setHoTen(scanner.nextLine());
		System.out.println("Nhap so CMND");
		this.setSoCMND(scanner.nextInt());
		System.out.println("Nhap ngay thang nam sinh:");
		this.dateInput();
		System.out.println("Nhap so tien trong vi");
		this.setViTien(scanner.nextInt());
		System.out.println("Nhap so hoa don");
		this.hoaDonInput();
	}

	public void out() {
		System.out.println("Ma kh:" + this.maKH);
		System.out.println("Ho ten:" + this.hoTen);
		System.out.println("CMND:" + (this.soCMND));
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String tmp = dateFormat.format(date);
		System.out.println("Ngay sinh:" + tmp);
		System.out.println("Cac hoa don");
		for (int i = 0; i < hoaDons.length; i++) {
			hoaDons[i].outPut();
		}
	}

	public int tongHD() {
		int sum = 0;
		for (int i = 0; i < hoaDons.length; i++) {
			sum += hoaDons[i].getTongTien();
		}
		return sum;
	}

	public void chuaChu_a(ArrayList<KhachHang> khachHangs) {
		for (int i = 0; i < khachHangs.size(); i++) {
			System.out.println(" Cac khach hang co ho ten chu chu a la ");
			if (khachHangs.get(i).getHoTen().contains("a") == true) {
				System.out.println("Khach hang thu" + (i + 1));
				khachHangs.get(i).out();
			}
		}
	}

	@SuppressWarnings("deprecation")
	public void sinhTrc1996(ArrayList<KhachHang> khachHangs) {
		for (int i = 0; i < khachHangs.size(); i++) {
			if (khachHangs.get(i).getDate().getYear() <= 1996) {
				khachHangs.get(i).out();
			}
		}
	}

	public void tienViLonHon10000(ArrayList<KhachHang> khachHangs) {
		System.out.println(" Cac khach hang co tien vi lon hon 10000 la");
		for (int i = 0; i < khachHangs.size(); i++) {
			if (khachHangs.get(i).getViTien() >= 10000) {
				System.out.println(" Khach hang thu " + (i + 1));
				khachHangs.get(i).out();
			}
		}
	}

	public void tienTongHDnhoHon6000(ArrayList<KhachHang> khachHangs) {
		System.out.println(" Cac khach hang co tong so tien hoa don khong lon hon 6000 la");
		for (KhachHang khachHang : khachHangs) {
			if (khachHang.tongHD() <= 6000) {
				khachHang.out();
			}
		}
	}

	public void duChitra(ArrayList<KhachHang> khachHangs) {
		System.out.println(" Cac khach hang co du tri phi tra cac hoa don la:");
		for (KhachHang khachHang : khachHangs) {
			if (khachHang.getViTien() > khachHang.tongHD()) {
				khachHang.out();
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<KhachHang> khachHangs = new ArrayList<>();
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Nhap so khach hang");
		n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(" Nhap cac thong tin cho khach hang " + (i + 1));
			KhachHang khachHang = new KhachHang();
			khachHang.inPut();
			khachHangs.add(khachHang);
		}
		System.out.println(" In danh sach khach hang");
		for (int i = 0; i < n; i++) {
			System.out.println(" Thong tin danh sach thu:" + (i + 1));
			khachHangs.get(i).out();
		}
		KhachHang tmp = new KhachHang();
		tmp.chuaChu_a(khachHangs);
		tmp.sinhTrc1996(khachHangs);
		tmp.tienViLonHon10000(khachHangs);
		tmp.tienTongHDnhoHon6000(khachHangs);
		tmp.duChitra(khachHangs);
	}
}
