package Tuan8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CongDan extends Vaccine{
	private String cmnd;
	private String hoTen;
	private int soMuiTiem;
	private Date ngaySinh;
	
	public CongDan() {super(); }
	public CongDan(String c, String ht, int smt, Date ns,
			String mvc, String tvc, double g) {
		super(mvc, tvc, g);
		this.cmnd = c;
		this.hoTen = ht;
		this.soMuiTiem = smt;
		this.ngaySinh = ns;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập cmnd: ");
		this.cmnd = sc.next();
		System.out.print("Nhập ho ten: ");
		sc.nextLine();
		this.hoTen = sc.nextLine();
		System.out.print("Nhập so mui tiem: ");
		this.soMuiTiem = sc.nextInt();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Nhập ngay sinh: ");
		String stringDate = sc.next();
		try {
			this.ngaySinh = dateFormat.parse(stringDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	public void output() {
		System.out.println(this.toString());
	}
	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy");
		String stringDate = dateFormat.format(this.ngaySinh);
		return "CongDan [cmnd=" + cmnd 
				+ ", hoTen=" + hoTen 
				+ ", soMuiTiem=" + soMuiTiem 
				+ ", ngaySinh=" + stringDate
				+ ", getMaVC()=" + getMaVC() 
				+ ", getTenVC()=" + getTenVC() 
				+ ", getGia()=" + getGia() + "]";
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getSoMuiTiem() {
		return soMuiTiem;
	}
	public void setSoMuiTiem(int soMuiTiem) {
		this.soMuiTiem = soMuiTiem;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
	
}
