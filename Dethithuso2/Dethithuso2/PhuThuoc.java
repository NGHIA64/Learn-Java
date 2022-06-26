package Dethithuso2;

import java.io.Serializable;

public class PhuThuoc implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String hoTen;
	private int tuoi;
	public PhuThuoc() {
		// TODO Auto-generated constructor stub
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public PhuThuoc(String hoTen, int tuoi) {
		super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
	}
	@Override
	public String toString() {
		return "PhuThuoc [hoTen=" + hoTen + ", tuoi=" + tuoi + "]";
	}
}
