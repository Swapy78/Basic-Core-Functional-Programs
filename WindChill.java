//Java program to calculate Wind Chill

package demo;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter t ");
		double t = sc.nextDouble(); // temperature in Fahrenheit
        System.out.println("Enter v ");
        double v = sc.nextDouble(); // wind speed in miles per hour
        
        if( t > 50 || 3 > v || v > 120) {
        	System.out.println("Invalid values");
        }
        else {

        // Calculate the wind chill
        double windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);

        // Print the result
        System.out.println("The windchill is "+windChill);
        
        sc.close();
        
    }

	}
}


