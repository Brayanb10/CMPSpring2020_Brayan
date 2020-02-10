/**
 * 
 * @author Brayan Batista
 * created: 02-09-2020
 * description : Program computes the product of three numbers
 */
package practiceClasswork.ide;

import java.util.Scanner;
public class PracticeClasswork {
	public static void main(String[] args) {
		Scanner keyboard; new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		// Declare Variables 
		
		System.out.print("Enter first number: ");
		int num1 = in.nextInt();
		System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        System.out.print("Enter third number: ");
        int num3 = in.nextInt();
        
        int product = num1*num2*num3;
        System.out.println("Output: "+product);
        
        
	
		
	
		
		
	}

	
	
}

