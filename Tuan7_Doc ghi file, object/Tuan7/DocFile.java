package Tuan7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DocFile {
	public static void main(String[] args) throws Exception {
		File file = new File("D:\\data.txt");
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(file);
			int i = 0;
			while((i = fin.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fin.close();
		}
	}
}
