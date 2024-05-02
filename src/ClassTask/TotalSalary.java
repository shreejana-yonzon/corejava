package ClassTask;

public class TotalSalary {

	public static void main(String[] args) {
		String[] post = {"MD", "CEO", "MANAGER", "HELPER"};
		int[] basicSalary = {230000, 250000, 176000, 145900};
		float[] bonus = {(20/100f), (float) (25.79/100), (16/100f), (9/100f)};
			int i;
		for(  i = 0; i < post.length; i++) {
			
			float totalSalary = basicSalary[i] +  basicSalary[i]*bonus[i] ;
			
			switch (post[i]) {
			
			case "MD":
				
				System.out.println("Total Salary of MD:" + " " +totalSalary);
				break;
				
			case "CEO":
				System.out.println("Total Salary of CEO:" +  " " +totalSalary);
				break;
				
			case "MANAGER":
				System.out.println("Total Salary of MANAGER:" + " " + totalSalary);
				break;
				
			case "HELPER":
				System.out.println("Total Salary HELPER:" + " " + totalSalary);
				break;
				
				
				default:
					System.out.println("Invalid!");
				
			}
		}
	}
}
