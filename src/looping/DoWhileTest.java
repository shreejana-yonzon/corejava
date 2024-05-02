package looping;

public class DoWhileTest {
/*
 * -------------do-while-----------
 * 
 * syntax: 
 * 
 *  do{
 *  
 *  //statement
 *  
 *  }while(condition);
 * 
 *  */
	
	public static void main(String[] args) {
		
		int value = 12;
		int i = 1;
		
		do {
			System.out.println(value + " x " + i +" = " + (value * i));
			i++;
		}while(i <= 10);
		
	}
}
