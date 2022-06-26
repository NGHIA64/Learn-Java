package Demo;

import java.util.Scanner;

public class sapxepmang2chieu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so hang: ");
		
		int n = sc.nextInt();
		System.out.println("Nhap so cot: ");
		int m = sc.nextInt();
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Mang vua nhap la: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(a[i][j] + " ");;
			}
			System.out.println();
		}
		//System.out.println("Nhap hang can sap xep: ");
		int k = m*n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (a[i][k]<a[j][k]) {
					int max = a[i][k];
					a[i][k] = a[j][k];
					a[j][k] = max;
					
				}

			}
		}
		System.out.println("Mang sap xep: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(a[i][j] + " ");;
			}
			System.out.println();
		}
		
	}

}
