//Nguyen Trong Nghia - 705105082
import java.util.Scanner;


public class XeCo {
	private String tenxe;
	private int giaxe;
	private String kieuxe;
	public XeCo() {
		// TODO Auto-generated constructor stub
	}
	public XeCo(String tenxe, int giaxe, String kieuxe) {
		
		this.tenxe = tenxe;
		this.giaxe = giaxe;
		this.kieuxe = kieuxe;
	}
	public String getTenxe() {
		return tenxe;
	}
	public void setTenxe(String tenxe) {
		this.tenxe = tenxe;
	}
	public int getGiaxe() {
		return giaxe;
	}
	public void setGiaxe(int giaxe) {
		this.giaxe = giaxe;
	}
	public String getKieuxe() {
		return kieuxe;
	}
	public void setKieuxe(String kieuxe) {
		this.kieuxe = kieuxe;
	}
	@Override
	public String toString() {
		return "\nTen xe: " + tenxe + "\nGia xe: " + giaxe + "\nKieuxe: " + kieuxe;
	}
	public void nhapdl() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten xe: ");
		tenxe = sc.nextLine();
		System.out.print("Nhap gia xe: ");
		giaxe = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap kieu xe: ");
		kieuxe = sc.nextLine();
				

	}
	public void hienthi() {
		// TODO Auto-generated method stub
		System.out.print(this.toString());

	}
	
	

}
