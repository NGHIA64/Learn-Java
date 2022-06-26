//Nguyen Trong Nghia - 705105082
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main_705105082 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<DoanhNghiep> dn = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so doanh nghiep: ");
		int n = sc.nextInt();
		while(n<=0)
		{
			System.out.println("Nhap lai: ");
			n = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			DoanhNghiep doanh = new DoanhNghiep();
			doanh.nhapdl();
			dn.add(doanh);
			
		}
		System.out.println("Tat ca doanh nghiep mua xe Sh mode va co so luong mua la so chinh phuong la: ");
		for (DoanhNghiep timdoanhnghiep : dn) {
			if (timdoanhnghiep.getTenxe() == "Sh mode" && timdoanhnghiep.kiemtrasochinhphuong() == true){
				timdoanhnghiep.hienthi();
			}
		}
		
		Collections.sort(dn, new Comparator<DoanhNghiep>() {

			@Override
			public int compare(DoanhNghiep o1, DoanhNghiep o2) {
				// TODO Auto-generated method stub
				return o2.tinhtongtien() - o1.tinhtongtien();
			}
		});
		System.out.println("Sap xep doanh nghiep theo chieu khong tang cua tong tien mua xe la: ");
		for (DoanhNghiep timdoanhnghiep : dn) {
			
				timdoanhnghiep.hienthi();
			
		}
		
		ArrayList<NguoiMua> nm = new ArrayList<>();
		System.out.print("\nNhap so nguoi mua: ");
		int m = sc.nextInt();
		while(m<=0)
		{
			System.out.println("Nhap lai: ");
			m = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			NguoiMua mua = new NguoiMua();
			mua.nhapdl();
			nm.add(mua);
			
		}
		System.out.println("So nguoi mua vua nhap la: ");
		for (NguoiMua nguoiMua : nm) {
			nguoiMua.hienthi();
		}
		
		Collections.max(nm, new Comparator<NguoiMua>() {

			@Override
			public int compare(NguoiMua o1, NguoiMua o2) {
				// TODO Auto-generated method stub
				
					return o1.getGiaxe() - o2.getGiaxe();
				
				
			}
		});
		System.out.println("Nguoi mua co xe co gia dat nhat la: ");
		for (NguoiMua nguoiMua : nm) {
			
			nguoiMua.hienthi();
		}
		System.out.println("Nhung nguoi mua xe Lead la: ");
		for (NguoiMua nguoiMua : nm) {
			if (nguoiMua.getTenxe() == "Lead") {
				nguoiMua.hienthi();
				
			}
		}
		
	}

}
