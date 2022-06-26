package Tuan7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DocObject {
	public static void main(String[] args) {
//		ArrayList<SinhVien> listSV = new ArrayList<SinhVien>();
//		listSV.add(new SinhVien("705105999", "Nguyen Van Nam"));
//		listSV.add(new SinhVien("705105998", "Tran Cong Nam"));
//		listSV.add(new SinhVien("705105997", "Nguyen Quang Ha"));
//		listSV.add(new SinhVien("705105996", "Tran Thu Trang"));
//		listSV.add(new SinhVien("705105995", "Vu Thi Hien"));
		File file = new File("D:\\object.txt");
		//Ghi vao file
//		FileOutputStream fout = null;
//		ObjectOutputStream obout = null;
//		try {
//			fout = new FileOutputStream(file);
//			obout = new ObjectOutputStream(fout);
//			obout.writeObject(listSV);
//			System.out.println("Ghi listSV thanh cong vao file " + file.getAbsolutePath());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		//Doc file
		ArrayList<SinhVien> listSV2 = new ArrayList<SinhVien>();
		FileInputStream fin = null;
		ObjectInputStream obin = null;
		try {
			fin = new FileInputStream(file);
			obin = new ObjectInputStream(fin);
			listSV2 = (ArrayList<SinhVien>) obin.readObject();
			System.out.println("Doc du lieu thanh cong tu file " + file.getAbsolutePath());
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(SinhVien sv:listSV2) {
			System.out.println(sv.toString());
		}
	}
}
