//Java program to find triplets from array whose sem is zero

package demo;

public class Triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 0, -3, 4, -5, 3 };
		 
		 System.out.println("Triplet with sum zero is ");
		 
		 for (int i = 0; i < arr.length - 2; i++) {
	            for (int j = i + 1; j < arr.length - 1; j++) {
	                for (int k = j + 1; k < arr.length; k++) {
	                    if (arr[i] + arr[j] + arr[k] == 0) {
	                        System.out.println(arr[i] +" "+ arr[j] + " "+ arr[k]);
	                    }
	                }
	            }
	        }
	
	}

}
