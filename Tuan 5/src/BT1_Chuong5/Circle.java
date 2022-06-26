package BT1_Chuong5;

import java.util.Scanner;

public class Circle implements Ishape {
	static final float PI = 3.1459f;
	private float radius;

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return this.radius * this.radius * PI;
	}

	@Override
	public float getPerimeter() {
		// TODO Auto-generated method stub
		return this.radius * PI * 2;
	}

	public void nhap(Circle[] circles) {
		Scanner cin = new Scanner(System.in);
		for (int i = 0; i < circles.length; i++) {
			System.out.println("Nhap ban kinh hinh tron " + (i + 1));
			circles[i] = new Circle();
			circles[i].setRadius(cin.nextFloat());
		}

	}

	public void hienThi() {
		System.out.println("Ban kinh la:" + (this.radius));
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Nhap so luong hinh tron");
		int m;
		m = cin.nextInt();
		Circle[] circle = new Circle[m];
		Circle tmp = new Circle();
		System.out.println("Nhap ban kinh cho cac hinh tron");
		tmp.nhap(circle);
		float area;
		System.out.println("Nhap dien tich hinh tron can tim");
		area = cin.nextFloat();
		cin.nextLine();
		System.out.println("Hinh tron can tim la");
		int dem = 0;
		for (int i = 0; i < circle.length; i++) {
			if (circle[i].getArea() == area) {
				System.out.println("Hinh tron thu " + (i + 1));
				circle[i].hienThi();
				dem++;
			}
		}
		if(dem==0)
		{
			System.out.println("Khong co hinh tron nao");
		}
		String y;
		System.out.println("Nhap y neu muon sap xep duong tron khong tang ve ban kinh - khong thi an phim bat ki");
		y = cin.nextLine();
		if (y.equals("y")) {
			for (int i = 0; i < circle.length; i++) {
				for (int j = i + 1; j < circle.length; j++) {
					if (circle[i].getRadius() > circle[j].getRadius()) {
						tmp = circle[i];
						circle[i] = circle[j];
						circle[j] = tmp;
					}
				}

			}
			cin.close();
		} 
		else {
			cin.close();
		}
	}
}
