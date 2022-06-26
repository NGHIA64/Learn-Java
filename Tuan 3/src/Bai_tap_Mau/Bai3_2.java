package Bai_tap_Mau;

import java.util.Scanner;

public class Bai3_2 {
	public static void main(String[] args) {
		int length;
		int width;
		Scanner cin = new Scanner(System.in);
		System.out.println("Nhap so hang cua mang:");
		length = cin.nextInt();
		System.out.println("Nhap so cot cua mang:");
		width = cin.nextInt();
		int[][] array = new int[length][width];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print("a[" + i + "][" + j + "]=");
				array[i][j] = cin.nextInt();
			}
		}
		int dem = 0;
		System.out.println("Hien thi ma tran");
		for (int i = 0; i < array.length; i++) {
			if (dem % array[0].length == 0) {
				System.out.print("\n");
			}
			for (int j = 0; j < array[0].length; j++) {

				System.out.print(array[i][j] + "\t");
				dem++;
			}
		}
		int max = array[0][0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if(array[i][j]>max)
				{
					max=array[i][j];
				}
			}
		}
		System.out.println("\nVi tri cua phan tu lon nhat trong mang la:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(array[i][j]==max)
				{
					System.out.println("Dong "+(i+1)+" Cot "+(j+1));
				}
			}
		}
		System.out.println("arr = " + array.length);
		System.out.println("arr0 = " + array[0].length);
		int[][] tmp = array;
		int k;
		System.out.println("Nhap dong can sap xep lai theo chieu khong giam ");
		k = cin.nextInt();
		System.out.println("Mang sau khi sap xep lai dong thu "+k+" la:");
		Sort(tmp,k-1);
		dem = 0;
		for (int i = 0; i < array.length; i++) {
			if (dem % array[0].length == 0) {
				System.out.print("\n");
			}
			for (int j = 0; j < array[0].length; j++) {

				System.out.print(tmp[i][j] + "\t");
				dem++;
			}
		}
		dem = 0;
		System.out.println("\nMa tran dao cua bieu dien mang la");
		for (int i = 0; i < array[0].length; i++) {
			if(dem % array.length == 0)
			{
				System.out.print("\n");
			}
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[j][i]+"\t");
				dem++;
			}
		}
		cin.close();
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