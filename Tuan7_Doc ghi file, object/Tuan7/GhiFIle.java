package Tuan7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GhiFIle {
	public static void main(String[] args) throws Exception {
		File fileData = new File("D:\\data.txt");
		FileOutputStream foStream = null;
		String strData = "Hello world...!";
		
		try {
			foStream = new FileOutputStream(fileData);
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
