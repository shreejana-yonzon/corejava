package objectWithMethod;

public class BookTest {
public static void main(String[] args) {
	//---------object as a parameter------
//	Book b = new Book();
//	b.setName("hari");
//	b.setPrice(3000);
//	b.setAuthor("Budhi");
//	b.setPublication("KEC publication");
	
	BookTest bt = new BookTest();
	Book b = bt.getBookDetails();
	bt.printBook(b);
}

//method for object as a parameter
void printBook(Book b) {
	
	System.out.println("Name: "+b.getName());
	System.out.println("Price: " +b.getPrice());
	System.out.println("Author: " +b.getAuthor());
	System.out.println("Publication: " + b.getPublication()  );
	
}

//--------object as return type--------
Book getBookDetails() {
	
	Book b = new Book();
	b.setName("Hari");
	b.setPrice(2000);
	b.setAuthor("Bhanu");
	b.setPublication("KEC");
	
	return b;
	
}
}
