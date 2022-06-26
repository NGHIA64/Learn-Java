package Demo;

public class timmaxmin {
	
	public static int max(int a, int b) {
		if (a < b) {
			return b;
		} return a;
	}
	
	public static int max(int a, int b, int c) {
		return max(max(a,b), c);
	}
	public static int max(int a, int b, int c, int d) {
		return max(max(a,b), max(c,d));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(timmaxmin.max(12, 8));
		System.out.println();
		System.out.print(timmaxmin.max(12, 20, 99));
		System.out.println();
		System.out.print(timmaxmin.max(12, 300, 99, 55));
		if (instanceof) {
			
		}
	}
 
}
