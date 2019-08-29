import java.util.*;
//Calculate Temperature 
public class Problem2 {
	public static void main (String[]arg) {
		//Declaration 
		double t=0, w=0, twc=0;
		
		Scanner kb2 = new Scanner(System.in);
		
		//Input  for temperature
		do { 
		System.out.print("Enter Temperature in Fahrenheit between:(-59 and 41): ");
		
		/*while (t < -59 || t > 41 ) {
		      System.out.println("That's not a valid a number!");
		       kb2.next(); // this is important!
		   }*/
		 
		    t = kb2.nextDouble();
		   
		
		}while(t < -59 || t > 41);
		
		
		//get wind speed
		
		do {
			System.out.print(" Enter the wind speed (>=2) in miles per hour: ");
			w = kb2.nextDouble();
			
		}while (w < 2 );
		
		//Calculate wind chill 
		
		
		twc = 35.74 + (0.6215 * t) - (35.75 *(Math.pow(w, 0.16))) + (0.4275 *t *(Math.pow(w, 0.16)));
		
		
		
		
		System.out.println("The Temperature you entered is:" + t + "°F");
		System.out.println("The speed you entered is:" + w + " mph");
		System.out.println("The Wind Chill Index is:" + twc );
		
		
		kb2.close();

	}
}
