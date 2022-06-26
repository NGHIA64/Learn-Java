package Print_Display;

import java.util.Scanner;

public class NhapDL {

static final int hang = 20000; //Khai báo hằng cho chương trình

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		System.out.print("What your name?: ");
		name =sc.nextLine();
		
		System.out.println("Welcome: "+ name);
		System.out.println("How old are you?");
		age = sc.nextInt();
		System.out.println("OK, Bạn tên là " + name + " - " + age + " tuổi");
		System.out.println("Tên của bạn có "+ name.length() + " kí tự");
		System.out.println("Kí tự đầu tiên là: "+name.charAt(0));
		int nam = 2000;
		String chuoi = nam + ""; // Chuyển biến nam về kiểu chuỗi
		System.out.println(chuoi.charAt(0));
		DemoProgram sv1 = new DemoProgram();
		DemoProgram sv2 = new DemoProgram("Nguyen Van Nam");
		DemoProgram sv3 = new DemoProgram("Tran Van Ha", 28);
		System.out.println(sv1.getInfo());
		System.out.println(sv2.getInfo());
		System.out.println(sv3.getInfo());
	}

}
