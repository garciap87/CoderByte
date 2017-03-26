/**
 * Using the Java language, have the function LongestWord(sen) take the sen 
 * parameter being passed and return the largest word in the string. If there
 * are two or more words that are the same length, return the first word from 
 * the string with that length. Ignore punctuation and assume sen will not be empty
 */

package LongestWord;
import java.util.Scanner;

public class Main 
{
	public static String LongestWord(String sen) 
	{ 
		int biggest = 0;
	    String[] parts = sen.replaceAll("[^a-zA-Z ]", "").split(" ");
	    String longestWord = "";
	    for(int i=0; i<parts.length; i++)
	    {
	      if(parts[i].length() > biggest)
	      {
	    	biggest=parts[i].length();
	    	longestWord = parts[i];
	      }
	    }
	    return longestWord;
	} 
	  
	  public static void main (String[] args) 
	  {  
	    System.out.print("Enter a string to find the largest word: ");    
	    Scanner s = new Scanner(System.in);
	    System.out.print(LongestWord(s.nextLine())); 
	    s.close();
	  }   
}