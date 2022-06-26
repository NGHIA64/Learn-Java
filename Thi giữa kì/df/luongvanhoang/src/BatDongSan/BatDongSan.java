package BatDongSan;
//Lương Văn Hoang 705105039

import java.util.*;

public class BatDongSan   {
    public int mabatdongsan,price,dientich,cachtrungtam;
    public String name;
    
    public BatDongSan(String name,int mabatdongsan,int price,int dientich,int cachtrungtam) {
		this.name = name;
		this.mabatdongsan = mabatdongsan;
		this.price=price;
		this.dientich = dientich;
		this.cachtrungtam = cachtrungtam;
	}
    
    public BatDongSan() {
		// TODO Auto-generated constructor stub
	}
	public int getMabatdongsan() {
		return mabatdongsan;
	}
	public void setMabatdongsan(int mabatdongsan) {
		this.mabatdongsan = mabatdongsan;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDientich() {
		return dientich;
	}
	public void setDientich(int dientich) {
		this.dientich = dientich;
	}
	public int getCachtrungtam() {
		return cachtrungtam;
	}
	public void setCachtrungtam(int cachtrungtam) {
		this.cachtrungtam = cachtrungtam;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    public void insert() {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("\n Ma bat dong san :"); this.mabatdongsan = sc.nextInt();
    	sc.nextLine();
    	System.out.print("\n ten bat dong san :"); this.name = sc.nextLine(); 
    	System.out.print("\n gia tri :"); this.price = sc.nextInt();
    	System.out.print("\n dien tich :"); this.dientich= sc.nextInt();
    	System.out.print("\n cach trung tam :"); this.cachtrungtam= sc.nextInt();
    }
    
    public void show() {
    	System.out.print("\n Ma bat dong san :" + this.mabatdongsan);
    	System.out.print("\n ten bat dong san :" + this.name); 
    	System.out.print("\n gia tri :" + this.price);
    	System.out.print("\n dien tich :" + this.dientich);
    	System.out.print("\n cach trung tam :" + this.cachtrungtam);
    }
}