import java.util.*;
//Calculate Area
public class problem3 {
public static void main (String[]arg) {
		
		//declarations
		double x1, y1, x2, y2, x3, y3;
		double side1, side2, side3, s;
		double area;
		
		Scanner kb = new Scanner(System.in);
		
		//Input
		System.out.print("Enter three points (6 numbers seperated by spaces ex: x1 y1 x2 y2 x3 y3):");
		x1 = kb.nextDouble();
		y1 = kb.nextDouble();
		x2 = kb.nextDouble();
		y2 = kb.nextDouble();
		x3 = kb.nextDouble();
		y3 = kb.nextDouble();
		
		//processing
		
		side1=Math.sqrt(Math.pow((x2-x1), 2)+ Math.pow((y2-y1),2));
		side2=Math.sqrt(Math.pow((x2-x3), 2)+ Math.pow((y2-y3),2));
		side3=Math.sqrt(Math.pow((x1-x3), 2)+ Math.pow((y1-y3),2));
		
		
		s = (side1+side2+side3)/2.0;
		
		area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		
		//output
		
		System.out.println("The area is:" + area);
		
		kb.close();	
		
	}


}
