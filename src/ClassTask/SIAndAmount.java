package ClassTask;

import java.util.Scanner;

public class SIAndAmount {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int p = sc.nextInt();
	int t = sc.nextInt();
	float r = sc.nextInt();
	
}
static float inputFunc(int p, int t, float r) {

	float SI = (p * t * r)/100;
	return SI;
	
}
}
