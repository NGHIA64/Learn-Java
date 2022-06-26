package Tuan7;

import java.io.Serializable;

public class SinhVien implements Serializable{
	private String maSV;
	private String name;
	
	public SinhVien() { }
	public SinhVien(String msv, String n) {
		this.maSV = msv;
		this.name = n;
	}
	
	@Override
	public String toString() {
		return "SinhVien [maSV=" + maSV + ", name=" + name + "]";
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
