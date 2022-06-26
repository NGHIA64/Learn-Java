package BatDongSan;

//Lương Văn Hoang 705105039

import java.util.*;

public class Main_705105039 {
       public static void main(String[] args) {
    	   Scanner sc = new Scanner(System.in);
    	   ChungCu cc;
    	   NhaDat nd;
    	   ArrayList<ChungCu> list_chungcu = new ArrayList<>();
    	   ArrayList<NhaDat> list_nhadat = new ArrayList<>();
    	   int num = sc.nextInt();
    	   int n = 0;
    	   while (n == 0) {
    	   System.out.print("\n 1. nhap nha dat ");
    	   System.out.print("\n 2. nhap chung cu");
    	   System.out.print("\n 3.in ra nha dat co mat tien > 5m");
    	   System.out.print("\n 4. tinh tong gia tri nha dat co dien tich la so chinh phuong");
    	   System.out.print("\n 5. sap xep nha dat theo chieu khong giam , in ra ");
    	   System.out.print("\n 6. dem so luong chung cu thoa man dieu kien");
    	   System.out.print("\n 7 dem so luong chung cu thoa man dieu kien");
    	   System.out.print("\n 8. tang gia tri cua cac can chung cu co chu dau tu la (VinGroup) ");
    	   int choice = sc.nextInt();
    	   Collections.sort(list_chungcu, new Comparator<ChungCu>() {

			@Override
			public int compare(ChungCu o1, ChungCu o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
    	  

		
    	   switch(choice){ 
    	       case 1:
    		        for (int i = 0 ; i < num ; i++) {
    		        	  nd = new NhaDat();
    		        	  nd.insert_nhadat();
    		        	  list_nhadat.add(nd);
    		        	  n = 0;
    		        }
    	       case 2:
    	    	   for (int i = 0 ; i < num ; i++) {
 		        	  cc = new ChungCu();
 		        	  cc.insert_chungcu();
 		        	  list_chungcu.add(cc);
 		        	  n = 0;
 		        }
    	    	   
    	       case 3:
    	    	   for (int i = 0; i < num ; ++i) {
    	    		   nd = new NhaDat();
    	    		   if (list_nhadat.get(i).mattien > 5) {
    	    			   list_nhadat.get(i).show();
    	    		   }
    	    	   }
    	    	   n=0 ;
    	       case 4:
    	    	   for (int i = 0; i < num ; ++i) {
    	    		   nd = new NhaDat();
    	    		   if (list_nhadat.get(i).mattien > 5) {
    	    			   list_nhadat.get(i).show();
    	    		   }
    	    	   }
    	           n = 0;
    	      
    	       case 6:
    	    	   for (int i = 0; i < num ; ++i) {
    	    		   if (list_chungcu.get(i).chudautu == "FLC" && list_chungcu.get(i).sophongngu >= 3) {
    	    			   list_chungcu.get(i).show();
    	    		   }
    	    	   }
    	          n =0 ;
    	   }
    	   }
       }
}
