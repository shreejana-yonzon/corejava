package corejava;

public class test {
public static void main(String[] args) {
	int x = 10;
	System.out.println(x++);//x=10 -> x= 11
	System.out.println(x+5);//x=16 ->x=11
	
	System.out.println(++x);//x=12
	System.out.println(++x + x++);//x=26
	
	System.out.println(x); //x=14
	
	
}
}
