package array;

import java.util.Arrays;

public class ArrayWithMethod {

	/*
	 * ---------------Array with method---------
	 *  1> array as arguments:
	 *  
	 *     void sum(int a[]) {
	 *     
	 *     }
	 *  2> array as return types:
	 *  
	 *  int get50IntValue(){
	 *  
	 *  //array = 500,55,45,33,6,25,;
	 *  
	 *  return array;
	 *  }
	 *  */
	
	public static void main(String[] args) {
		
		int [] data = { 45,78,90,33,35,12,67,90,100,130, 154};
		
		//calling sum method
		sum(data);
		
		String [] contry = {"Nepal", "India", "Canada", "USA"};
		printCountries(contry);
		
		//calling array from return type
		char[] vals = getValues();
		//to print arrays  from return type
		System.out.println(Arrays.toString(vals));
		
		int[] num = getIntValues();
		System.out.println(Arrays.toString(num));
	}
	
	//------------array as parameter----------
	static void sum(int values[]) {
		
		int s = 0;
		
		//read the value from array
		
		for(int x : values) {
			
			s = s + x;
			 
			
		}
		System.out.println("Total = " +s);
		
		
	}
	static void printCountries(String name[]) {
		
		String p = " ";
		for(String x : name) {
			p = p + x;
		}
		System.out.println("country = " + p+" ");
	}
	
	
	//---------------array as return type-------------
	
	
	static char[] getValues() {
		char[] vs = {'a','e','i','o','u'};
		return vs;
	}
	
	static int[] getIntValues() {
		int[] vals = {23,56,67,89,97,45,62,13,55,90};
		return vals;
	}
	
}
