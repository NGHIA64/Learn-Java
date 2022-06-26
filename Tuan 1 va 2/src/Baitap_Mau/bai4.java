package Baitap_Mau;
import java.util.Scanner;

public class bai4 {
	private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input: ");
        char chu = scanner.next().charAt(0);
        int asciiCode = chu;
        System.out.println("Output: " + asciiCode);
        scanner.close();
    }
}
