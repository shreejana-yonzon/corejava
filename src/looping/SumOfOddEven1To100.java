package looping;

public class SumOfOddEven1To100 {
public static void main(String[] args) {
	
	int es = 0;
	int os = 0;
	
	for (int i = 1; i<=100; i++) {
		if(i%2 == 0) {
			es = es + i;
			System.out.println(es);
		}else {
			os = os +i;
			System.out.println(os);
		}
	}
}
}
