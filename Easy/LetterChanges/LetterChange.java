/**
 * Using the Java language, have the function LetterChanges(str) take the str parameter being 
 * passed and modify it using the following algorithm. Replace every letter in the string with 
 * the letter following it in the alphabet (ie. c becomes d, z becomes a). Then capitalize 
 * every vowel in this new string (a, e, i, o, u) and finally return this modified string. 
 */

package LetterChanges;
import java.util.Scanner;

public class LetterChange 
{
	public static String LetterChanges(String str) 
	{ 
		//..........................This way of doing it doens't account for if the character is z or a special character such as *...............
		/*
		String updatedString = "";
		char[]charArray = str.toCharArray();
		
		for(int i = 0; i < charArray.length; i++)
		{
			char nextChar = charArray[i];
			int x = nextChar + 1;
			updatedString += (char)x;
		}
	    System.out.print("The updated string is: ");
	    updatedString = updatedString.replace("a", "A").replace("e", "E").replace("i", "I").replace("o", "O").replace("u", "U");
	    
	    return updatedString;
	    */
		//........................................................................................................................................

		String updatedString = "";
		
		for(int i = 0; i < str.length(); i++)
		{
			//if the character is between a and y
			if(str.charAt(i) > 96 && str.charAt(i) < 122)
			{
				updatedString += (char)(str.charAt(i) + 1);
			}
			else if(str.charAt(i) == 122) //if the character is z
			{
				updatedString += (char)97;
			}
			else
			{
				updatedString += str.charAt(i);
			}
		}
		
		updatedString = updatedString.replace("a", "A").replace("e", "E").replace("i", "I").replace("o", "O").replace("u", "U");
	    System.out.print("The updated string is: ");
	    
	    return updatedString;
	  } 
	  
	  public static void main (String[] args) 
	  {  
	    System.out.print("Please entera a string: ");     
	    Scanner s = new Scanner(System.in);
	    System.out.print(LetterChanges(s.nextLine())); 
	    s.close();
	  }   
}