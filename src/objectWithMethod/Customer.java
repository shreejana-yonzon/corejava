package objectWithMethod;

public class Customer {
 private int id;
 private String Fname;
 private String Lname;
 private String Address;
 private long mobileNum;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return Fname;
}
public void setFname(String fname) {
	Fname = fname;
}
public String getLname() {
	return Lname;
}
public void setLname(String lname) {
	Lname = lname;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public long getMobileNum() {
	return mobileNum;
}
public void setMobileNum(long mobileNum) {
	this.mobileNum = mobileNum;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", Fname=" + Fname + ", Lname=" + Lname + ", Address=" + Address + ", mobileNum="
			+ mobileNum + "]";
}
 
}
