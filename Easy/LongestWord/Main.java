package LongestWord;
import java.util.Scanner;
public class Main 
{
	public static String LongestWord(String sen) 
	{ 
		int smallest = 0;
	    String[] parts = sen.replaceAll("[^a-zA-Z ]", "").split(" ");
	    String ben = "";
	    for(int i=0; i<parts.length; i++)
	    {
	      if(parts[i].length() > smallest)
	      {
	        smallest=parts[i].length();
	        ben = parts[i];
	      }
	    }
	    return ben;
	  } 
	  
	  public static void main (String[] args) 
	  {  
	    System.out.print("Please enter a string: ");    
	    Scanner s = new Scanner(System.in);
	    System.out.print(LongestWord(s.nextLine())); 
	    s.close();
	  }   
}