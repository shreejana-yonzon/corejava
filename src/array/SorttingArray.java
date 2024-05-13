package array;

import java.util.Arrays;

public class SorttingArray {
	
public static void main(String[] args) {
	
	int[] values = {73,35,56,67,21,34,56,99,19,36};
	String[] name = {"Ram", "Hari","Sita","Gita"};
	
	Arrays.sort(values);
	System.out.println(Arrays.toString(values));
	
	Arrays.sort(name);
	System.out.println(Arrays.toString(name));
	
	System.out.println("------------reverse array-----------");
	//to print reverse
	for(int i = values.length-1; i>=0; i--) {
		System.out.println(values[i] + " ");
	}
	
	for(int i = name.length-1; i>=0; i--) {
		System.out.println(name[i] + " ");
	}
}
}
