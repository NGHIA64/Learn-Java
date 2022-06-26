//Nguyen Trong Nghia - 705105082
import java.util.Scanner;


public class DoanhNghiep extends XeCo {
	private String tendoanhnghiep;
	private int soluongmua;
	private String tinhthanh;
	
	public DoanhNghiep() {
		// TODO Auto-generated constructor stub
	}

	public DoanhNghiep(String tendoanhnghiep, int soluongmua, String tinhthanh, String tenxe, int giaxe, String kieuxe) {
		super(tenxe, giaxe, kieuxe);
		this.tendoanhnghiep = tendoanhnghiep;
		this.soluongmua = soluongmua;
		this.tinhthanh = tinhthanh;
	}


	public String getTendoanhnghiep() {
		return tendoanhnghiep;
	}


	public void setTendoanhnghiep(String tendoanhnghiep) {
		this.tendoanhnghiep = tendoanhnghiep;
	}
	public int getSoluongmua() {
		return soluongmua;
	}


	public void setSoluongmua(int soluongmua) {
		this.soluongmua = soluongmua;
	}


	public String getTinhthanh() {
		return tinhthanh;
	}


	public void setTinhthanh(String tinhthanh) {
		this.tinhthanh = tinhthanh;
	}
	@Override
	public void nhapdl() {
		// TODO Auto-generated method stub
		super.nhapdl();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten doanh nghiep: ");
		tendoanhnghiep = sc.nextLine();
		System.out.print("Nhap so luong mua: ");
		soluongmua = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap tinh thanh: ");
		tinhthanh = sc.nextLine();
	}
	@Override
	public void hienthi() {
		// TODO Auto-generated method stub
		super.hienthi();
		System.out.print(this.toString());
	}

	@Override
	public String toString() {
		return "\nTen doanh nghiep: " + tendoanhnghiep + "\nSo luong mua: " + soluongmua + "\nTinh thanh: " + tinhthanh + "\nTong tien mua xe: " + this.tinhtongtien();
	}
	public boolean kiemtrasochinhphuong() {
		// TODO Auto-generated method stub
			int k = (int) Math.sqrt(this.soluongmua);
			if(Math.sqrt(this.soluongmua)-k==0)
			{
				return true;
			}
			else return false;
		
	}
	
	public int tinhtongtien() {
		int k = (int) this.getGiaxe() * this.soluongmua;
		return k;
		
	}

	
}
