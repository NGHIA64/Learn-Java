package Baitap_Mau;
import java.util.Scanner;

public class bai5 {
	
	    private static Scanner scanner = new Scanner(System.in);
	    public static void main(String[] args) {
	        System.out.print("Input: ");
	        char chu = scanner.next().charAt(0);
	        String m = scanner.nextLine();
	        System.out.println("Chu in hoa: " + m.toUpperCase());
	        int asciiCode = chu;
	        int  asciiValue = (int)chu; //Sai r
	        System.out.println("Output: " + asciiCode);
	        scanner.close();
	    }
	}