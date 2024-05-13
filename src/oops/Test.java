package oops;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	
//	Scanner sc = new Scanner(System.in);
	//math book object
	
	Book b = new Book();
	b.id = 244;
	b.name = "Math";
	b.price = 6000;
	b.author ="Ram Krishna ";
	
	b.printBook();
	System.out.println("--------------------");
	
	
	//science
	Book s = new Book();
	s.id = 123;
	s.name = "Science";
	s.price = 7500; 
	s.author =" Oshin ";
	s.printBook();
	
	//Nepali
	Book n = new Book();
	n.id = 274;
	n.name = "Nepali";
	n.price = 1400;
	n.author = "Govinda";
	n.printBook();
}
}
