//Java program to check the power value of 2

package practice;

import java.util.Scanner;

public class Powerof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 2;
		int power;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the power value");
		power = sc.nextInt();
		
		double powerof2 = Math.pow(n, power);
		
		System.out.println("The value of 2 to the power of " +power+ " is " + powerof2);
		
		
		sc.close();
	}
	

}
