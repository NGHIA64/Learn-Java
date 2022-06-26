package Tuan8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class main_705105988 {

	public static void main(String[] args) throws Exception {
		int n;
		DoanhNghiep dn;
		ArrayList<DoanhNghiep> listDN = new ArrayList<DoanhNghiep>();
		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhập N Doanh nghiệp: ");
//		n = sc.nextInt();
//		for(int i = 0; i < n; i++) {
//			dn = new DoanhNghiep();
//			dn.input();
//			listDN.add(dn);
//		}
		listDN.add(new DoanhNghiep("Doanh nghiep 1", 10000, "Ha Noi", "vc001", "Vero cell", 15000));
		listDN.add(new DoanhNghiep("Doanh nghiep 2", 5000, "Ha Nam", "vc002", "Astra", 75000));
		listDN.add(new DoanhNghiep("Doanh nghiep 3", 17000, "Hai Phong", "vc003", "Fizer", 56000));
		listDN.add(new DoanhNghiep("Doanh nghiep 4", 20000, "HCM", "vc004", "Nanocovax", 12000));
		//Cau a
		for(DoanhNghiep d:listDN) {
			if(d.getTenVC().equals("Vero cell") || d.getSoLuongVC() == 10000) {
				d.output();
			}
		}
		//Cau b
		for(DoanhNghiep d:listDN) {
			System.out.println("Doanh nghiep " + d.getTenDN() + " phai tra " + (int)d.tongTien());
		}
		//Cau c
		Comparator<DoanhNghiep> sapXepDN = new Comparator<DoanhNghiep>() {
			@Override
			public int compare(DoanhNghiep d1, DoanhNghiep d2) {
				// TODO Auto-generated method stub
				return (int)d1.tongTien() - (int)d2.tongTien();
			}
		};
		listDN.sort(sapXepDN);
		System.out.println("----------------List DN sau khi sap xep----------------");
		for(DoanhNghiep d:listDN) {
			d.output();
		}
		//Cau d
		CongDan cd;
		ArrayList<CongDan> listCD = new ArrayList<CongDan>();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		listCD.add(new CongDan("012345789", "Nguyen Van A", 3, 
				dateFormat.parse("28/05/2000"), 
				"vc001", "Bstrazeneca", 150000));
		listCD.add(new CongDan("012345567", "Nguyen Van B", 2, 
				dateFormat.parse("21/12/2005"), 
				"vc002", "Bstra", 550000));
		listCD.add(new CongDan("012345666", "Nguyen Van C", 1, 
				dateFormat.parse("18/04/1990"), 
				"vc003", "Fizer", 780000));
		for(CongDan c:listCD) {
			c.output();
		}
		int dem = 0;
		boolean check = false;
		for(CongDan c:listCD) {
			if(c.getTenVC().toLowerCase().contains("astra")) {
				dem++;
				check = true;
			}
		}
		if(check) { // check == true
			System.out.println("Co " + dem + " nguoi tiem Astrazeneca");
		} else { // check = false
			System.out.println("Khong co ai tiem Astrazeneca");
		}
		
		for(int i = 0; i < listCD.size(); i++) {
			dateFormat = new SimpleDateFormat("yyyy");
			int namSinh = Integer.parseInt(
					dateFormat.format(listCD.get(i).getNgaySinh())
					);
			int tuoi = 2022 - namSinh;
			if(tuoi < 18) {
				listCD.remove(listCD.get(i));
			}
		}
		for(CongDan c:listCD) {
			c.output();
		}
		
	}

}
