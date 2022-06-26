package Baitap_Mau;
import java.util.Scanner;

public class bai8 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			String s = input.nextLine();
			
			int flag = 0;
			for(int i = 0; i < s.length(); i++){
			    if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
			        flag = 1;
			}
			if(flag == 1)
			    System.out.println("False-Chuoi chua chu so");
			else
			    System.out.println("True-Chuoi hop le");
		}
	}

