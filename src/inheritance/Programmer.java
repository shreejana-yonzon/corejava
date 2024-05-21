package inheritance;
//employee ko properties haru aauxa
public class Programmer extends Employee {

	String progLang;
	int bonus;
	String project;
	
	void print() {
		super.print();//it calls the parent print method i.e Employee ko print method.
		System.out.println("Language = " + progLang);
		System.out.println("Bonus = " + bonus);
		System.out.println("Project = " + project);
	}
}
