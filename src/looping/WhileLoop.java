package looping;

public class WhileLoop {
/*
 * ----------------while-loop-----------
 *   syntax: 
 *   
 *   while(condition){
 *   
 *      //statement
 *   
 *   }
 *   */
	public static void main(String[] args) {
		
		//5! = 5 * 4 * 3 * 2
		
		int n = 5;
		int fact = 1;
		
		while (n >1) {
			fact = fact * n;
			n--;
		}
		System.out.println("Result:" + fact);
	}
}
