//Java program to print 2D array of integers and doubles 

package demo;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int M, N, i, j;
		
		 
		    int arr[][] = new int[5][5];
		    Scanner scan = new Scanner(System.in);
		    
		    // enter row and column for array.
		    System.out.print("Enter row for the array : ");
		    M = scan.nextInt();
		    System.out.print("Enter column for the array : ");
		    N = scan.nextInt();

		    // enter array elements.
		    System.out.println("Enter " + (M * N) + " Array Elements : ");
		    for (i = 0; i < M; i++) {
		      for (j = 0; j < N; j++) {
		        arr[i][j] = scan.nextInt();
		      }
		    }
		    
		    // the 2D array is here.
		    System.out.print("The Array is :\n");
		    for (i = 0; i < M; i++) {
		      for (j = 0; j < N; j++) {
		        System.out.print(arr[i][j] + "  ");
		      }
		      System.out.println();
		    }
		    
		    
		    double M1, N1;
		    
		    
		    double array[][] = new double[5][5];
		 // enter row and column for array.
		    System.out.print("Enter row for the array : ");
		    M1 = scan.nextInt();
		    System.out.print("Enter column for the array : ");
		    N1 = scan.nextInt();
		    
		    // enter array elements.
		    System.out.println("Enter " + (M1 * N1) + " Array Elements : ");
		    for (i = 0; i < M1; i++) {
		      for (j = 0; j < N1; j++) {
		       array[i][j] = scan.nextInt();
		      }
		    }
		    
		    
		    
		    // the 2D array is here.
		    System.out.print("The Array is :\n");
		    for (i = 0; i < M1; i++) {
		      for (j = 0; j < N1; j++) {
		      System.out.print(array[i][j] + "  ");
		      }
		      System.out.println();
		    }
		  }
		
            
        
        
       
    }
		
	


