package Assignment3;

import java.util.Scanner;

public class FindFactorials {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input= new Scanner(System.in);
		
		int num, fact=1;
		System.out.println("Enter any positive integer: ");
		num= input.nextInt();
		
		for(int i=num;i>=1;i--) {
			
			fact=fact*i;
			
			
		}
		System.out.println("Factorial =  "+ fact);

	}

}
