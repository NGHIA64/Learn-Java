package Demo;

import java.util.Scanner;

public class Mang_2_Chieu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so hang: ");
		int n = sc.nextInt();
		System.out.print("Nhap so cot: ");
		int m = sc.nextInt();
		int a[][] = new int[100][100];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("a[" + i + "][" + j +"]= ");
				a[i][j] = sc.nextInt();			}
		}
		System.out.println("Mang ban vua nhap la: ");
		int max = 0;
		int c = 0;
		int d = 0;
		double tb = 0;
		int dem =0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
			System.out.print(a[i][j] + " ");
			tb = tb + a[i][j];
			dem ++;
			if (a[i][j]>max) {
				max = a[i][j];
				c = i + 1;
				d = j + 1;
			}
			}
			System.out.println();
		}
		System.out.println("So lon nhat trong mang la: " + max);
		System.out.print("Vi tri xuat hien cua max la: a[" + c + "][" + d + "]");
		System.out.println("\nGia tri trung binh cua mang la: " + (tb / dem));
		System.out.print("Nhap so nguyen k: ");
		
		
		int[][] tmp = a;
		int k1;
		System.out.println("Nhap dong can sap xep lai theo chieu khong giam ");
		k1 = sc.nextInt();
		System.out.println("Mang sau khi sap xep lai dong thu "+k1+" la:");
		Sort(tmp,k1-1);
		dem = 0;
		for (int i = 0; i < a.length; i++) {
			if (dem % a[0].length == 0) {
				System.out.print("\n");
			}
			for (int j = 0; j < a[0].length; j++) {

				System.out.print(tmp[i][j] + "\t");
				dem++;
			}
		}
		

			
		}
	public static void Sort(int [][] a,int k)
	{
		int tmp;
		for (int i = 0; i < a[0].length; i++) {
			for (int j = i+1; j < a[0].length; j++) {
				if(a[k][i]>a[k][j])
				{
					tmp = a[k][i];
					a[k][i]=a[k][j];
					a[k][j]=tmp;
				}
			}
		}
	}
	


		
	}


