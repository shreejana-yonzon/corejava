package objectWithArray;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//store and print data of 5 books.
		
		//create array
		Book books[] = new Book[5];
		
		
		//write data in array
		
//		yo chahi static tarikako lagi
		
//		Book b = new Book();
//		b.setId(123);
//		b.setName("Hello");
//		b.setAuthor("Arun");
//		b.setPrice(1200);
		
		//for dynamic
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<books.length; i++) {
			
			Book b = new Book();
			
			System.out.println("Enter id");
			b.setId(sc.nextInt());
			
			System.out.println("Enter Name");
			b.setName(sc.next());
			
			System.out.println("Enter price");
			b.setPrice(sc.nextInt());
			
			System.out.println("Enter author");
			b.setAuthor(sc.next());
			
			books[i] = b;
		}
		
		
		
		
		//read data from array
		int totalPrice = 0;
		for(Book bok : books) {
			if(bok.getAuthor().equals("Bikas")) {
				System.out.println(bok);
				totalPrice =totalPrice + bok.getPrice();
				System.out.println("total price:" + totalPrice);
			}
			
		}
		
		
	}
}
