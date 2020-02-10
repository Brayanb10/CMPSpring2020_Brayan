/**
 * 
 * @author Student: Brayan Batista
 * created: 02-10-2020
 *description: Write a program that calculates BMI of 3 different Users. 
 */
import java.util.Scanner;
public class ClassWorkW3 {
	public static void main(String[]  args ) {
		Scanner input = new Scanner(System.in);

        System.out.print("Input weight of Maria in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Input height of Maria in inches: ");
        double inches = input.nextDouble();

        double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        System.out.print("Body Mass Index is " + BMI+"\n");
        
        
        System.out.print("Input weight of David in pounds: ");
        double Davidweight = input.nextDouble();

        System.out.print("Input height of David in inches: ");
        double Davidinches = input.nextDouble();

        double BMI2 = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        System.out.print("Body Mass Index is " + BMI+"\n");

        System.out.print("Input weight of Joes in pounds: ");
        double Joeweight = input.nextDouble();

        System.out.print("Input height of Joe in inches: ");
        double Joeinches = input.nextDouble();

        double JoeBMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        System.out.print("Body Mass Index is " + BMI+"\n");
        
        
	}
	

}
