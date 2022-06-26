package BatDongSan;
//Lương Văn Hoang 705105039

import java.util.Scanner;

public class ChungCu extends BatDongSan{
    public String chudautu;
    public int sophongngu,phiguixe;
    public boolean tangham,tienich;
   
    public ChungCu(String name,int mabatdongsan,int price,int dientich,int cachtrungtam,String chudautu,int sophongngu,int phiguixe,boolean tangham,boolean tienich) {
          super( name, mabatdongsan, price , dientich, cachtrungtam);
          this.chudautu = chudautu;
          this.sophongngu = sophongngu;
          this.phiguixe = phiguixe;
          this.tangham = tangham;
          this.tienich = tienich;
  	}
    
    public ChungCu() {
		// TODO Auto-generated constructor stub
	}
    
	public String getChudautu() {
		return chudautu;
	}
	public void setChudautu(String chudautu) {
		this.chudautu = chudautu;
	}
	public int getSophongngu() {
		return sophongngu;
	}
	public void setSophongngu(int sophongngu) {
		this.sophongngu = sophongngu;
	}
	public int getPhiguixe() {
		return phiguixe;
	}
	public void setPhiguixe(int phiguixe) {
		this.phiguixe = phiguixe;
	}
	public boolean isTangham() {
		return tangham;
	}
	public void setTangham(boolean tangham) {
		this.tangham = tangham;
	}
	public boolean isTienich() {
		return tienich;
	}
	public void setTienich(boolean tienich) {
		this.tienich = tienich;
	}
    
	 
	  public void insert_chungcu() {
		    Scanner sc = new Scanner(System.in);
		    super.insert();
	    	System.out.print("\n chu dau tu:"); this.chudautu = sc.nextLine();
	    	System.out.print("\n so phong ngu:"); this.sophongngu = sc.nextInt(); 
	    	System.out.print("\n phi gui xe :"); this.phiguixe = sc.nextInt();
	    	
	    	System.out.print("\n tang ham (1,co | 2,khong) :"); 
	    	int choice = sc.nextInt();
	    	switch (choice) { case 1: this.tangham = true; case 2: this.tangham=false;}
	    	System.out.print("\n tien ich :");
	    	int choice2 = sc.nextInt();
	    	switch (choice2) { case 1: this.tienich = true; case 2: this.tienich=false;}
	  }
    
	    public void show() {
	    	super.show();
	    	System.out.print("\n chu dau tu :" + this.chudautu);
	    	System.out.print("\n so phong ngu :" + this.sophongngu); 
	    	System.out.print("\n phi gui xe :" + this.phiguixe);
	    	System.out.print("\n tang ham :" + this.tangham);
	    	System.out.print("\n tien ich :" + this.tienich);
	    }
}