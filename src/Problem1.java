import java.util.*;
//Calculate Distance 
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration 
		double x1, y1, x2, y2;
		double distance;
		
		//input
		Scanner kb1 = new Scanner(System.in);
		
		System.out.print("Enter 4 points: x1 y1 x2 y2:");
		
		x1 = kb1.nextDouble();
		y1 = kb1.nextDouble();
		x2 = kb1.nextDouble();
		y2 = kb1.nextDouble();
		
		//Processing 
		distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1), 2));
		
		//output 
		System.out.println("The Distance is: " + distance);
		
		kb1.close();

	}
}
