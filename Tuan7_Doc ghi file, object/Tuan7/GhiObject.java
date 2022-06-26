package Tuan7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GhiObject {
	public static void main(String[] args) {
		ArrayList<ViTien> listVT = new ArrayList<ViTien>();
		File fileData = new File("D:\\da.txt");
		FileOutputStream foStream = null;
		ObjectOutputStream ooStream = null;
		listVT.add(new ViTien("VT001", 120000));
		listVT.add(new ViTien("VT002", 750000));
		listVT.add(new ViTien("VT003", 360000));
		try {
			foStream = new FileOutputStream(fileData);
			ooStream = new ObjectOutputStream(foStream);
			ooStream.writeObject(listVT);
			System.out.println("Ghi du lieu thanh cong...!");
		} catch (Exception e) {
			System.out.println("Co loi xay ra:");
			e.printStackTrace();
		}
	}
}
