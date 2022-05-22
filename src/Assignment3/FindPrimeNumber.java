package Assignment3;

public class FindPrimeNumber {

	public static void main(String[] args) {

		int num = 11;
		
		boolean isPrime = true;
		
		for(int i=2; i<num/2; i++) {
			
			if(num%i == 0) {
				isPrime = false;
				break;
			}//end if
		}//end for
		
		if(isPrime == false)
			System.out.println("Not a prime number");
		else
			System.out.println("Its a Prime Number");
		

	}//end main

}
