package Dethithuso2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main_705105134 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Nhap so nhan vien");
		n = scanner.nextInt();
		while (n<=0||n>=100) {
			System.out.println("Nhap lai");
			n = scanner.nextInt();
		}
		System.out.println("Nhap thong tin cho cac nhan vien");
		ArrayList<NhanVien> nhanViens = new ArrayList<NhanVien>();
		for (int i=0;i<n;i++) {
			System.out.println("Nhap thong tin cho nhan vien thu "+(i+1));
			NhanVien nhanVien = new NhanVien();
			nhanVien.nhap();
			nhanViens.add(nhanVien);
		}
		File file = new File("nhanvien.txt");
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(nhanViens);
			System.out.println("Ghi file thanh cong");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(fileOutputStream!=null)
			{
				fileOutputStream.close();
			}
			if(objectOutputStream!=null)
			{
				objectOutputStream.close();
			}
		}
		System.out.println("Doc du lieu tu file nhanvien.txt");
		FileInputStream fileInputStream = null;
		ObjectInputStream inputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
			inputStream = new ObjectInputStream(fileInputStream);
			nhanViens = (ArrayList<NhanVien>) inputStream.readObject();
			System.out.println("Doc file thanh cong");
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(fileInputStream!=null)
			{
				fileInputStream.close();
			}
			if(inputStream!=null)
			{
				inputStream.close();
			}
		}
		for (NhanVien nhanVien : nhanViens) {
			nhanVien.xuat();
		}
		System.out.println("Danh sach nhan vien sap xep theo chieu khong giam cua tuoi la:");
		Comparator<NhanVien> comparator = new Comparator<NhanVien>() {

			@Override
			public int compare(NhanVien o1, NhanVien o2) {
				// TODO Auto-generated method stub
				return o1.getNgaySinh().getYear()-o2.getNgaySinh().getYear();
			}
			
		};
		Collections.sort(nhanViens, comparator);
		Collections.reverse(nhanViens);
		for (NhanVien nhanVien : nhanViens) {
			nhanVien.xuat();
		}
		System.out.println("Ten nhung nhan vien co so nguoi phu thuoc la lon hon 10 va tuoi trung binh cua nhung nguoi phu thuoc lon hon 30 la");
		for (NhanVien nhanVien : nhanViens) {
			if(nhanViens.size()>10 && nhanVien.tuoiTBnguoiPT()>30)
			{
				System.out.println(nhanVien.getHoTen());
			}
		}
	}
	
}
