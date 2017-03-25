/**
Allow the user to enter a string, then find the first
character that repeats and print to the screen
 */

package FirstCharacter;
import java.util.Scanner;

public class First 
{
	public static void main(String[] args) 
	{
		boolean found = false;
		
		System.out.print("Please enter a string: ");
		Scanner scanner = new Scanner(System.in);
		String firstCharacter = scanner.nextLine();
		
		//Transform the string to a character array
		char[] charArray = firstCharacter.toCharArray();
		
		for(int i =0; i < charArray.length && !found; i++)
		{
			for(int j = i+1; j<charArray.length; j++)
			{
				if(charArray[i] == charArray[j])
				{
					System.out.println("The first repeating character is: " + charArray[j]);
					found = true;
					break;
				}
				
			}
		}

	}

}
