package CapitalizeEachWord;
import java.util.Scanner;

public class Capitalize 
{
 public static void main(String[] args)
	{
		System.out.print("Please enter a string that you want to capitalize each word of: ");
		Scanner s = new Scanner(System.in);
		
		System.out.println(LetterCapitalize(s.nextLine()));
		s.close();
	}
	
	public static String LetterCapitalize(String str) 
	{ 
		String[] words = str.split(" ");
		char upperCase;
		String changed="";
		
		for(int i = 0; i <words.length; i++)
		{
			upperCase= Character.toUpperCase(words[i].charAt(0));
			changed += upperCase;
			
			for(int j = 1; j < words[i].length(); j++)
			{
				changed += words[i].charAt(j);
			}
			
			changed += " ";
		}
		
		return changed; 
	}
}