/**
 *
 * @author: Brayan Batista
 * 03-02-2020
 */

import java.util.Scanner;
public class PowerProgram {
	public static void main(String[] args) {

        int base = 2;
        int exponent = 4;

        int result = 1;

        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }

        System.out.println("Answer = " + result);
    }

}
