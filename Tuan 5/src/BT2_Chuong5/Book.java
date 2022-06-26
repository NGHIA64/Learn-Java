package BT2_Chuong5;

import java.util.Scanner;

public class Book extends Author {
	private String name;
	private float price;

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public void nhap() {
		System.out.println("Nhap so tac gia");
		int n;
		Scanner cin = new Scanner(System.in);
		n = cin.nextInt();
		Author[] author = new Author[n];
		System.out.println("Nhap thong tin cac tac gia");
		for (int i = 0; i < author.length; i++) {
			System.out.println(i + 1);
			author[i].setName(cin.nextLine());
			author[i].setEmail(cin.nextLine());
		}
		System.out.println("Nhap ten sach");
		this.name = cin.nextLine();
		System.out.println("Nhap gia ban sach");
		this.price = cin.nextFloat();
	}

	@Override
	public void hienThi(Author[] authors) {
		// TODO Auto-generated method stub
		for (int i = 0; i < authors.length; i++) {
			System.out.println(i + 1);
			System.out.println("Ten tac gia:" + authors[i].getName());
			System.out.println("Email:" + authors[i].getEmail());
		}
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n;
		int dem = 0;
		System.out.println("Nhap so dau sach");
		n = cin.nextInt();
		System.out.println("Nhap thong tin cac cuon sach");
		Book[] books = new Book[n];
		for (int i = 0; i < books.length; i++) {
			System.out.println("Nhap thong tin cho dau sach thu" + (i + 1));
			books[i] = new Book();
			books[i].nhap();
		}
		System.out.println("So dau sach co gia tu 200k tro len la");
		for (int i = 0; i < books.length; i++) {
			if (books[i].getPrice() >= 200000) {
				dem++;
			}
		}
		System.out.println(dem);
	}
}
