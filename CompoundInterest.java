package com.bridgelabz;

import java.util.Scanner;

public class CompoundInterest {
	
	
		
		public static void main(String[] args) {
			
			double p,t,r,n;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the principle");
			p = sc.nextDouble();
			
			System.out.println("Enter the time");
			t = sc.nextDouble();
		
			
			System.out.println("Enter the number of times ci per year");
			n = sc.nextDouble();
			
			double Amount= p *Math.pow (1 + (r /n ), n * t);
			double ci = Amount - p;
			System.out.println("Comp interest: " + ci );
			System.out.println("Amount:  " + Amount);
		
	}
}
