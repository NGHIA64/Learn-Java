package Tuan7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class GhiFileAppend {
	public static void main(String[] args) throws Exception {
		File fileData = new File("D:\\data.txt");
		FileOutputStream foStream = null;
		String strData = "\nJava is easy...";
		
		try {
//			foStream = new FileOutputStream(fileData);
			foStream = new FileOutputStream(fileData, true);
			byte[] byteData = strData.getBytes();
			foStream.write(byteData);
			System.out.println("Ghi thanh cong vao file " + fileData.getAbsolutePath());
		} catch (FileNotFoundException e) {
			System.out.println("Co loi xay ra...!");
			e.printStackTrace();
		} finally {
			foStream.close();
		}
	}
}
