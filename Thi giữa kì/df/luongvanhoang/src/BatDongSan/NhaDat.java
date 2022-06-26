package BatDongSan;
//Lương Văn Hoang 705105039

import java.util.Scanner;

public class NhaDat extends BatDongSan {
	 public int mattien,sotang,chieurongngo;
	    public boolean sanvuon;
	    
	    public NhaDat(String name,int mabatdongsan,int price,int dientich,int cachtrungtam) {
	          super( name, mabatdongsan, price , dientich, cachtrungtam);
	          
	  	}
	    
	    public NhaDat() {
			// TODO Auto-generated constructor stub
		}

		public int getMattien() {
			return mattien;
		}

		public void setMattien(int mattien) {
			this.mattien = mattien;
		}

		public int getSotang() {
			return sotang;
		}

		public void setSotang(int sotang) {
			this.sotang = sotang;
		}

		public int getChieurongngo() {
			return chieurongngo;
		}

		public void setChieurongngo(int chieurongngo) {
			this.chieurongngo = chieurongngo;
		}

		public boolean isSanvuon() {
			return sanvuon;
		}

		public void setSanvuon(boolean sanvuon) {
			this.sanvuon = sanvuon;
		}
	    
		  public void insert_nhadat() {
			    Scanner sc = new Scanner(System.in);
			    super.insert();
		    	System.out.print("\n mat tien :"); this.mattien = sc.nextInt();
		    	System.out.print("\n so tang :"); this.sotang = sc.nextInt(); 
		    	System.out.print("\n chieu rong ngo :"); this.chieurongngo = sc.nextInt();
		    	System.out.print("\n san vuon "); 
		    	int choice = sc.nextInt();
		    	switch (choice) { case 1: this.sanvuon = true; case 2: this.sanvuon=false; break;}
		  }

		@Override
		public String toString() {
			return "NhaDat [mattien=" + mattien + ", sotang=" + sotang + ", chieurongngo=" + chieurongngo + ", sanvuon="
					+ sanvuon + ", mabatdongsan=" + mabatdongsan + ", price=" + price + ", dientich=" + dientich
					+ ", cachtrungtam=" + cachtrungtam + ", name=" + name + "]";
		}
	    
		  
}
