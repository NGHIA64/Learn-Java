
public class phuthuoc {
private String tennguoiphuthuoc = "";
private int tuoi;
public phuthuoc() {
	
}
public phuthuoc(String tennguoiphuthuoc, int tuoi) {
	this.tennguoiphuthuoc = tennguoiphuthuoc;
	this.tuoi = tuoi;
}
public String getTennguoiphuthuoc() {
	return tennguoiphuthuoc;
}
public void setTennguoiphuthuoc(String tennguoiphuthuoc) {
	this.tennguoiphuthuoc = tennguoiphuthuoc;
}
public int getTuoi() {
	return tuoi;
}
public void setTuoi(int tuoi) {
	this.tuoi = tuoi;
}
@Override
public String toString() {
	return "phuthuoc [tennguoiphuthuoc=" + tennguoiphuthuoc + ", tuoi=" + tuoi + "]";
}


}
