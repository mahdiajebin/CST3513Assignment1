import java.util.*;

public class problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare 
		double x1, y1, x2, y2, x3, y3; 
		double side1, side2, side3;
		
		
		Scanner kb6 = new Scanner(System.in);

		//  enter three edges for a triangle
		System.out.println("Enter three Edges for a triangle:");
		System.out.print(" Edge 1 points x, y: ");
		x1 = kb6.nextDouble();
		y1 = kb6.nextDouble();
		System.out.print(" Edge 2 points x, y: ");
		x2 = kb6.nextDouble();
		y2 = kb6.nextDouble();
		System.out.print(" Edge 3 points x, y: ");
		x3 = kb6.nextDouble();
		y3 = kb6.nextDouble();

		// Test if input is valid
		boolean valid = (x1 + y1 > x3 + y3 && x2 + y2 > x3 + y3) ||
							 (x1 + y1 > x2 + y2 && x3 + y3 > x2 + y2) ||
							 (x3 + y3 > x1 + y1 && x2 + y2 > x1 + y1);

		if (!valid)
		{
			System.out.println("Input is invalid.");
			System.exit(1);
		}

		// Sides
		side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);

		//Peremeter
		System.out.println("perimeter of triangle is " + (side1 + side2 + side3));
		kb6.close();
	}
}


