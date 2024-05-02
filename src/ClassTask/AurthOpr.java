package ClassTask;

public class AurthOpr {
public static void main(String[] args) {
	
	int num1 = 400;
	int num2 = 60;
	
	String[] sign = { "+", "-", "*", "/"};
	int i ;
	for (i = 0; i<=3; i++) {
		
		switch (sign[i]) {
		
		case "+":
			int sum = num1 + num2;
			System.out.println("Total sum:" + " "+sum);
			break;
			
		case "-":
			int diffrence = num1 - num2;
			System.out.println("Total diffrence:" + " "+diffrence);
			break;
			
		case "*":
			int mult = num1 + num2;
			System.out.println("Total mult:" + " "+mult);
			break;
			
		case "/":
			float div = num1 / num2;
			System.out.println("Total div:" + " "+div);
			break;
			
			default:
				System.out.println("Invalid result");
		}
	}
	
}
}
