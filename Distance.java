//Java Program to find distance from the point (x,y) to the origin (0,0)

package demo;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        // Enter x- and y-coordinates from command-line arguments
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter x ");
    	int x = sc.nextInt();
    	System.out.println("Enter y ");
    	int y = sc.nextInt();
      

        // compute distance to (0, 0)
        double distance = Math.sqrt(x*x + y*y);

        // output distance
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + distance);
        
        sc.close();
    }
}

