package objectWithMethod;

public class Students {
private int id;
private String fname;
private String lname;
private String faculty;
private int rollNo;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getFaculty() {
	return faculty;
}
public void setFaculty(String faculty) {
	this.faculty = faculty;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

@Override
public String toString() {
	return "Students [id=" + id + ", fname=" + fname + ", lname=" + lname + ", faculty=" + faculty + ", rollNo="
			+ rollNo + "]";
}

}
