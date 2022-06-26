package Print_Display;

public class DemoProgram {
	static private String truong ="HNUE";
	private String ten;
	//Khai báo hàm tạo 
	DemoProgram(){
		this.ten = "none";
	}
	DemoProgram(String fn){
		this.ten = fn;
	}
	DemoProgram(String fn, int age){
		this.ten  = fn + " - " + age;
		
		
	}
	
	public String getInfo() {
		return ten + " - " + truong;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!!");
	}
	
	
	
	

}
