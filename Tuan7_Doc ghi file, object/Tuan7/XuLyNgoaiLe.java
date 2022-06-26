package Tuan7;

public class XuLyNgoaiLe {
	public static void main(String[] args) {
		int a = 5, b = 0, result;
		try {
			result = a/b;
		} catch(Exception e) {
			System.out.println("Co loi xay ra...:");
//			e.printStackTrace();
			System.out.println("b = 0 ==> b = 1");
			b = 1;
			result = a/b;
		}
		System.out.println("a/b = " + a + "/" + b + " = " + result);
	}
}
