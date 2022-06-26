package Tuan6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KhachHang {
	private String maKH;
	private String hoTen;
	private String soCCCD;
	private Date ngaySinh;
	private String email;
	private ArrayList<HoaDon> dsHoaDon;
	private ViTien vt;
	public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
	
	public KhachHang() {
		dsHoaDon = new ArrayList<HoaDon>();
		vt = new ViTien();
	}

	public KhachHang(String maKH, String hoTen, String soCCCD, Date ngaySinh, 
			String email, ArrayList<HoaDon> dsHoaDon, ViTien vt) {
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.soCCCD = soCCCD;
		this.ngaySinh = ngaySinh;
		this.email = email;
		this.dsHoaDon = dsHoaDon;
		this.vt = vt;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		int n;
		HoaDon hd;
		 
		System.out.print("Ma KH: ");
		maKH = sc.next();
		System.out.print("Ho ten KH: ");
		sc.nextLine();
		hoTen = sc.nextLine();
		System.out.print("So can cuoc cong dan: ");
		soCCCD = sc.next();
		
		try {
			System.out.print("Ngay sinh: ");
			ngaySinh = dateFormat.parse(sc.next());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.print("Email: ");
		email = sc.next();
		
		System.out.print("Nhap so luong Hoa Don: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			hd = new HoaDon();
			hd.input();
			dsHoaDon.add(hd);
		}
		
		vt.input();
	}
	
	public void output() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "KhachHang [maKH=" + maKH + ", hoTen=" + hoTen + ", soCCCD=" + soCCCD + 
				", ngaySinh=" + dateFormat.format(ngaySinh) + ", email=" + email + ", dsHoaDon=" + dsHoaDon 
				+ ", vt=" + vt + "]";
	}
	
	public double getAllTongTienHD() {
		double tong = 0;
		for (int i = 0; i < dsHoaDon.size(); i++) {
			tong += dsHoaDon.get(i).getTongTienHD();
		}
		return tong;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getSoCCCD() {
		return soCCCD;
	}

	public void setSoCCCD(String soCCCD) {
		this.soCCCD = soCCCD;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<HoaDon> getDsHoaDon() {
		return dsHoaDon;
	}

	public void setDsHoaDon(ArrayList<HoaDon> dsHoaDon) {
		this.dsHoaDon = dsHoaDon;
	}

	public ViTien getVt() {
		return vt;
	}

	public void setVt(ViTien vt) {
		this.vt = vt;
	}
	
	
	
	
}
