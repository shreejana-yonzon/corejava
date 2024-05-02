package method;

public class AreaVolumeUsingMethod {
public static void main(String[] args) {
	
	int area = areaOfCircle(30, 20);
	System.out.println("Area of circle: " + area);
			
			
	float volume = volumeOfCircle(5, 10);
	System.out.println("Volume of circle: " + volume);
}
static int areaOfCircle(int l, int b) {
	
	int area = l * b;
	return area;
	
}
static float volumeOfCircle(float r, float h ) {
	
	float volume = (2 * 22 * r * h)/7;
	return volume;
}
}
