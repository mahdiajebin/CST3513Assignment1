import java.util.*;
//Investment amount 
public class Problem4 {
	public static void main (String[]arg) {
		//Declare 
		double InvestAmount, NumOfYears;
		double monthlyInterestRate;
		double FutureInvestmentValue;
		
		
		//Input 
		Scanner kb4 = new Scanner (System.in);
		//Invest amount 
		System.out.print("Enter Investment Amount:");
		InvestAmount = kb4.nextDouble();
		//rate
		
		
		System.out.print("Enter annual interest rate in percentage: ");
		monthlyInterestRate = kb4.nextDouble();
		monthlyInterestRate /= 1200;
		
		
		//years
		System.out.print("Enter number of years: ");
		NumOfYears = kb4.nextDouble();
		
		//Processing
		
		
		FutureInvestmentValue = InvestAmount * Math.pow(1 + monthlyInterestRate,NumOfYears*12);
		
		//Output
		System.out.println("Future Value is:" + FutureInvestmentValue);
		kb4.close();
		
		
}
	}
