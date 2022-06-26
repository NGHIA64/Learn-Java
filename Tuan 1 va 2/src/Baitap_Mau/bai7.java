package Baitap_Mau;
import java.util.Scanner;

public class bai7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		
		for(int i = s.length()-1; i >= 0; i--){
		    System.out.print(s.charAt(i) + s.length());
		}
	}
}


