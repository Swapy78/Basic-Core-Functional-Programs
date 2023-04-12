//Java Program to Swap Two Numbers

package practice;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int temp = 0;
		
		System.out.println("First number "+a);
		System.out.println("Second number "+b);
		
		temp = a;
		a = b;
		b = temp;
		
		
		System.out.println("---After swappning---");
		System.out.println("First number "+a);
		System.out.println("Second number "+b);
	}

}
