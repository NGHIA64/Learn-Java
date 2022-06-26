package Bai_tap_Mau;

public class Bai6 {
	static final int n = 1000;
	public static void main(String[] args) {
		int dem = 0;
		System.out.println("Cac so chinh phuong nho hon 1000 la:");
		for (int i = 1; i < n; i++) {
			if(SCP(i)==true)
			{
				System.out.print(i+"\t");
				dem++;
			}
		}
		System.out.println("\nSo so chinh phuong nho hon 1000 la:"+dem);
	}
	public static boolean SCP(int i) {
		int k = (int) Math.sqrt(i);
		if(Math.sqrt(i)-k==0)
		{
			return true;
		}
		else return false;
	}
}
