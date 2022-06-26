package BT1_Chuong5;

import java.util.Scanner;

public class Rectangle implements Ishape {
	private float length;
	private float width;

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public float getLength() {
		return length;
	}

	public float getWidth() {
		return width;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return this.length * this.width;
	}

	@Override
	public float getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (this.length + this.width);
	}

	public void nhap() {
		Scanner cin = new Scanner(System.in);
		System.out.println("Nhap chieu dai");
		this.length = cin.nextFloat();
		System.out.println("Nhap chieu rong");
		this.width = cin.nextFloat();
	}

	public void hienThi() {
		System.out.println("Chieu dai la:" + (this.length));
		System.out.println("Chieu rong la:" + (this.width));
	}

	public static void main(String[] args) {
		int n;
		System.out.println("Nhap so cac hinh chu nhat");
		Scanner cin = new Scanner(System.in);
		n = cin.nextInt();
		Rectangle[] retangles = new Rectangle[n];
		for (int i = 0; i < retangles.length; i++) {
			System.out.println("Nhap thong tin cho hcn thu" + (i + 1));
			retangles[i] = new Rectangle();
			retangles[i].nhap();
		}
		System.out.println("Cac hinh chu nhat co chu vi lon nhat la");
		Rectangle pmax = retangles[0];
		for (int i = 0; i < retangles.length; i++) {
			if (retangles[i].getPerimeter() > pmax.getPerimeter()) {
				pmax = retangles[i];
			}
		}
		for (int i = 0; i < retangles.length; i++) {
			if (retangles[i].getPerimeter() == pmax.getPerimeter()) {
				System.out.println("Hinh chu nhat thu " + (i + 1));
				retangles[i].hienThi();

			}

		}
		System.out.println("Cac hinh chu nhat co dien tich lon nhat la:");
		Rectangle smax = retangles[0];
		for (int i = 0; i < retangles.length; i++) {
			if(retangles[i].getArea()>smax.getArea())
			{
				smax = retangles[i];
			}
		}
		for (int i = 0; i < retangles.length; i++) {
			if(retangles[i].getArea() == smax.getArea())
			{
				System.out.println("Hinh chu nhat thu "+(i+1));
				retangles[i].hienThi();
			}
		}
		cin.close();
	}
}
