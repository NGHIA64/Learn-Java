package Demo;

import java.util.Scanner;

public class Person {

	
		public String name;
		public int age;
		public double height;
		private double weight;
		public double getWeight() {
			return weight;
		}
		public void input() {
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhap ten: ");
			name = sc.nextLine();
			System.out.print("Nhap tuoi: ");
			age = sc.nextInt();
			
		}
		public void output() {
			System.out.println(this.toString());
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
		//Khai bao ham khoi tao
		public Person() { //ham tao khong co tham so
			name = "no name";
			age = -1;
			height = -1;
			weight = -1;
		}
		public Person(String name, int age, double height, double weight) {
			this.name = name;
			this.age = age;
			this.height = height;
			this.weight = weight;
		}
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
		}
		
	}


