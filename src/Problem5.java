import java.util.*;

public class Problem5 {
	
	public static void main (String[]arg) {
	
		//Declare 
	double a, b, c , x1 = 0, x2;
	double discriminant;

		//input 
	Scanner kb5 = new Scanner (System.in);
		System.out.println("Enter a b c : ");
		a = kb5.nextDouble();
		b = kb5.nextDouble();
		c = kb5.nextDouble();
		
	
		//processing 
		discriminant = Math.pow(b, 2) - 4 * a *c ;
		
		
	
	System.out.print("The equation");
	
	 if( discriminant > 0 ) {
		 	x1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
			x2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
			
         System.out.print(" has two root: " +x1+ "  " + x2);
         
         
 }else if( discriminant == 0 ) {
    	  
    	x2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
    	
         System.out.print(" has one root: " + x1);
         
         
      }else {
    	  
         System.out.print(" has no real root");
      }
	 
	 
	 //
	 kb5.close();
	
		
		
		
	}

}
