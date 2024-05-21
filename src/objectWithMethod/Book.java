package objectWithMethod;

public class Book {

	private String name;
	private int price;
	private String author;
	private String publication;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", author=" + author + ", publication=" + publication + "]";
	}
	
	
}
