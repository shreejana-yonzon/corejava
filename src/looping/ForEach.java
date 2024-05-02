package looping;

public class ForEach {
/*
 * ----------------for each loop----------
 *  #use to read data from collection (array, list, set, map)
 *  #enhanced for loop
 *    #syntax :
 *     
 *     for(data_type var : collection){
 *     
 *       //statement
 *       
 *       }
 *     */
	
	public static void main(String[] args) {
		
		int[] values = {65, 36, 78, 90, 89, 45, 77 };
		
		int s = 0;
		
		for(int x : values) {
			System.out.println(x);
			s = s +x;
		}
		System.out.println("Total : " +s);
	}
}
