//Java program to flip Coin and print percentage of Heads and Tails

package practice;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int flips = 10;
		
		
		for(int i = 1; i <= flips; i++) {
		
			
		
		if(Math.random() < 0.5) {
			System.out.println("Tails" );
				
		}
			else {
				System.out.println("Heads" );
					
			}
		
			
		}
	}

}
