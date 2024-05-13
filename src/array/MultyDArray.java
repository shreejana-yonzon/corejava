package array;

import java.util.Scanner;

public class MultyDArray {
/*
 * ------------Multy-D array----------
 * 
 *  #use to manage data in row and column form or matrix form.
 *   
 *   syntax:
 *   
 *   data_type[][] array_name = new data_type[row][col];
 *   
 *   */
	
	public static void main(String[] args) {
		
		int mat[][] = new int[2][2];
		
		Scanner sc = new Scanner(System.in);
		
		//write data in array
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<2; j++) {
				//static way
//				mat[i][j] =50;
				
				//for dynamic value
				mat[i][j] = sc.nextInt();
				
			}
		}
		
		//read data from array
		for(int i = 0; i<2; i++) {
			for(int j =0; j<2; j++) {
				System.out.println(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
