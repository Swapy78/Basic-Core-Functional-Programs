//Java program to find the roots of the given equation

package demo;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Read the values of a, b and c from the user
	        System.out.print("Enter the value of a: ");
	        double a = sc.nextDouble();

	        System.out.print("Enter the value of b: ");
	        double b = sc.nextDouble();

	        System.out.print("Enter the value of c: ");
	        double c = sc.nextDouble();

	        // Calculate delta
	        double delta = b * b - 4 * a * c;
	        
	        if (delta < 0) {
	            System.out.println("The equation does not have any real roots.");
	        } else {

	        // Calculate the roots of the equation
	        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
	        double root2 = (-b - Math.sqrt(delta)) / (2 * a);

	        // Print the roots of the equation
	        System.out.println("Root 1 of x = " + root1);
	        System.out.println("Root 2 of x = " + root2);
	        
	        sc.close();
	    }
	}
}
	


