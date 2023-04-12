//Java program to find Harmonic value of a number

package practice;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n=4,i;
		
		double sum = 0;
	
		for(i=1; i<=n; i++) {
			sum = sum+(1/i);
		}
		System.out.println("The Harmonic Value is "+sum);
	}

}
