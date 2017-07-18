/**
 * Determine if the first character in a string is capitalized
 */

package CapitalizeFirstCharacter;
import java.util.Scanner;

public class FirstCharacter 
{
	public static void main(String[] args) 
	{
		System.out.print("Please enter a string: ");
		Scanner scanner = new Scanner(System.in);
		firstCharacter(scanner.nextLine());
		scanner.close();
	}
	
	public static void firstCharacter(String input)
	{
		if(Character.isUpperCase(input.charAt(0)))
			System.out.print("The first characters is a Capital.");
		else
			System.out.print("The first character is lower case.");
	}
}