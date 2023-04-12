//Java program to print the prime factors of a number

package practice;

public class PrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		
		System.out.println("The prime factors of n are ");
		
		
		for(int i = 2; i*i<=n; i++) {
			while (n % i == 0)
		      {
		        System.out.println(i + " ");
		        n = n / i;

		}
		
	}
		if (n > 1) System.out.println(n);
		else       System.out.println();

}
}
