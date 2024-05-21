package constructor;

public class User {
  //instance variable
	//properties
	String userName;
	String password;
	//multiple constructor is also know as constructor overloading.
	//Constructor return only object values.
	//-------------------default constructor-----------
	User(){
		userName = "root";
		password = "123";
	}
	
	//---------------------parameterized constructor----------
	User(String userName, String password){
		this.userName = userName;
		this.password = password;
		
		//method call
//		this.printUser();
	}
	//---------------------parameterized constructor----------
		User(String userName){
			this.userName = userName;
		}
	void printUser() {
		System.out.println("UserName = "+userName);
		System.out.println("Password = "+password);
	}
	
	public static void main(String[] args) {
		
		//creating object 
		User u = new User("root","123");//new le memory allocate garchha, User() vanne ko chahi constructor ho.
		u.printUser();
	}
	
}
