
import java.util.Scanner;
public class PatternTwo
{
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int n;
		int space;
		int count = 1;

		System.out.println("Please enter a number 1...9 : ");

		n = input.nextInt();
		//n = 9;
		System.out.print(" ");

		for(int i = n; i > 0; i--)
		{
			for(space=i;space<=i;space++)
			{
				System.out.print("");
				for(int x = n; x > 0; x--)
				{
					if(x > count)
					{
						System.out.print("  ");
						//System.out.print( " ");
					}

					else if(x == 1)
					{
						
						if( (i  + n) == n + 1) {
							System.out.println(x );
							//System.out.print( " sss");
							//System.out.println(i);
							//System.out.println(n);
						}
						else {
							System.out.println(x );
							System.out.print( " ");
						}
						
						
						
					}

					else
					{
						System.out.print(x);
						System.out.print( " ");
						

					}
					
					//if(x < n)
						//
				}
			}
			count++;
		}

		//System.out.println("0000000" );
		//System.out.print( "kjhkljhg ");
		

	}

}

