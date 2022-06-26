import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class connguoi {
private String hoten;
private Date ngaysinh;
private String gioitinh;
public connguoi() {
} 
public connguoi(String hoten, Date ngaysinh, String gioitinh) {
	this.hoten = hoten;
	this.ngaysinh = ngaysinh;
	this.gioitinh = gioitinh;
}
public String getHoten() {
	return hoten;
}
public void setHoten(String hoten) {
	this.hoten = hoten;
}
public Date getNgaysinh() {
	return ngaysinh;
}
public void setNgaysinh(Date ngaysinh) {
	this.ngaysinh = ngaysinh;
}
public String getGioitinh() {
	return gioitinh;
}
public void setGioitinh(String gioitinh) {
	this.gioitinh = gioitinh;
}
@Override
public String toString() {
	return "connguoi [hoten=" + hoten + ", ngaysinh=" + ngaysinh + ", gioitinh=" + gioitinh + "]";
} 
public void nhapdl() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap ho ten:");
	hoten = sc.nextLine();
	System.out.println("Nhap ngay sinh:");
	SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	try {
		ngaysinh = df.parse(sc.nextLine());
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Nhap gioi tinh:");
	
}
public void hienthi() {
	System.out.println(this.toString());
}
public Date ngay() {
	SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	df.format(this.ngaysinh);
	return ngaysinh;
}

}
