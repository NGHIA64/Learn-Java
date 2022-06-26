package Demo;

import java.util.Scanner;

public class Student extends Person{
	//Khai bao thuoc tinh
	private String studentID;
	private String schoolName;
	private String majopr;
	
	//Khai bao ham khoi tao
	public Student() {
		//Ham mac dinh
		super();
		studentID = schoolName = majopr = "null";
	}
	public Student(String sid, String scn, String mj, String name, int age, double height, double weight) {
		super(name,age, height, weight);
		studentID = sid;
		schoolName = scn;
		majopr = mj;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getMajopr() {
		return majopr;
	}
	public void setMajopr(String majopr) {
		this.majopr = majopr;
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", schoolName=" + schoolName + ", majopr=" + majopr
				+ ", getWeight()=" + super.getWeight() + "]";
	}
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("StudenID: ");
		studentID = sc.next();
		sc.nextLine();
		System.out.print("School: ");
		schoolName = sc.nextLine();
		System.out.print("Major: ");
		majopr = sc.nextLine();
		}
	public void output(){
		System.out.println(this.toString());
	}
}
