package Bai_tap_Mau;

public class Bai7 {
	static final int n = 1000;

	public static void main(String[] args) {
		int dem = 0;
		System.out.println("Cac so nguyen to nho hon 1000 la:");
		for (int i = 1; i < n; i++) {
			if (SNT(i) == true) {
				System.out.print(i + "\t");
				dem++;
			}
		}
		System.out.println("\nSo so nguyen to nho hon 1000 la:" + dem);
	}

	public static boolean SNT(int k) {
		int t = (int) Math.sqrt(k);
		if(k==1||k==2)
		{
			return true;
		}
		else
		{
			for (int i = 2; i <= t; i++) {
				if(k%i==0)
				{
					return false;
				}
			}
		}
		return true;
	}

}
