//Nguyen Trong Nghia - 705105082
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;


public class NguoiMua extends XeCo {
	private int cmnd;
	private String hoten;
	private  Date ngaysinh;
	private String gioitinh;
	public NguoiMua() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NguoiMua(String tenxe, int giaxe, String kieuxe,int cmnd, String hoten, Date ngaysinh, String gioitinh) {
		super(tenxe, giaxe, kieuxe);
		this.cmnd = cmnd;
		this.hoten = hoten;
		this.ngaysinh = ngaysinh;
		this.gioitinh = gioitinh;
		// TODO Auto-generated constructor stub
	}
	public int getCmnd() {
		return cmnd;
	}
	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	@Override
	public void nhapdl() {
		// TODO Auto-generated method stub
		super.nhapdl();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap so cmnd: ");
		cmnd = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap ho ten: ");
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		try {
			System.out.println("Nhap ngay sinh: ");
			ngaysinh = df.parse(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Nhap khong dung ngay sinh!");
		}
		hoten = sc.nextLine();		
		System.out.print("Nhap gioi tinh: ");
		gioitinh = sc.nextLine();
	}
	@Override
	public void hienthi() {
		// TODO Auto-generated method stub
		super.hienthi();
		System.out.print(this.toString());
		this.tinhtien();
	}
	@Override
	public String toString() {
		return "\nNhap so cmnd: " + cmnd + "Nhap ho ten: " + hoten + "Nhap ngay sinh: " + date() + "Gioi tinh: " + gioitinh;
	}
	
	public Date date() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Ngay sinh: " + sdf.format(this.ngaysinh));
		return ngaysinh;
	}
	
	public int tinhtien() {
		int gia = 0;
		if (getTenxe() == "Lead") {
			gia = this.getGiaxe() * 10/100;
		}
		return gia;
		
	}
	
	
	
	
	

}
