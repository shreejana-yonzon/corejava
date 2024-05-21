package encapsulation;

public class Test {
public static void main(String[] args) {
	
	Product p = new Product();
//	p.id = 12;
//	p.name = "TV";
//	p.company = "CG";
//	p.price = 50000;
	
	p.setId(12);
	p.setName("TV");
	p.setCompany("CG");
	p.setPrice(5000);
	
//	System.out.println("Id = "+ p.getId());
//	System.out.println("Name = "+ p.getName());
//	System.out.println("Company = "+ p.getCompany());
//	System.out.println("price = "+ p.getPrice());
	
	System.out.println(p);
}
}
