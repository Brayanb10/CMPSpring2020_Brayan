import java.util.Scanner;

/**
 * 
 * @author: Brayan Batista
 * created:02-19-2020
 *
 */
public class CoatAdviser {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Welcome To Coat Adviser");
		System.out.println("Enter Weather in fareinheit");
		double weather = kb.nextDouble();
		
		if(weather >70)
			System.out.println("Its's hot");
		else if( weather >50)
			System.out.println("It's warm");
		else if(weather >30)
			System.out.println("It's cold, wear a jacket");
		else
			System.out.println("It's too cold, wear a coat");
		
		
		
		
		
	}

}
