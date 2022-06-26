package Demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class Person {
	private String hoten;
	private String diachi;
	private int age;
	public Person() {
		
	} 
	public Person(String hoten, String diachi, int age) {
		this.hoten = hoten;
		this.diachi = diachi;
		this.age = age;
	}
	public void nhapdl() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho va ten: ");
		hoten = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		diachi = sc.nextLine();
		System.out.print("Nhap tuoi: ");
		age = sc.nextInt();
		
		
	}

	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "\nHo ten: " + hoten + "\nDia chi: " + diachi + "\nTuoi: " + age;
	}
	public void hienthi() {
		System.out.print(this.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person s = new Person();
		Scanner sc = new Scanner(System.in);
		ArrayList<Person> s = new ArrayList<>();  
		System.out.print("Nhap so nguoi: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Person s1 = new Person();
			s1.nhapdl();
			s.add(s1);
		}
		System.out.println("Nguoi vua nhap la: ");
		for (Person person : s) {
			System.out.println(person);
		}
		Collections.sort(s, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		System.out.println(java.time.LocalTime.now()); 
		
		System.out.println("Sau sap xep la: ");
		for (Person person : s) {
			System.out.println(person);
		}
	}

}
