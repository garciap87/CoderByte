/*
Using the Java language, have the function SimpleSymbols(str) take the str parameter being passed 
and determine if it is an acceptable sequence by either returning the string true or false. 
The str parameter will be composed of + and = symbols with several letters between them (ie. ++d+===+c++==a)
 and for the string to be true each letter must be surrounded by a + symbol. So the string to the left would 
 be false. The string will not be empty and will have at least one letter. 
 
Sample Test Cases:
Input:"+d+=3=+s+"
Output:"true"

Input:"f++d+"
Output:"false"
 */

package SimpleSymbols;

import java.util.*; 
import java.io.*;

class Main 
{  
  public static String SimpleSymbols(String str) 
  { 	  
      for( int i = 0; i < str.length(); i++ ) 
      {
	  //Checking to see if the first character in the string is a character. Your lookig for the + symbol.
	  //If it is a character you know its false.
	  if( Character.isLetter(str.charAt(i)) && i == 0 )
	  {
	      return "false";
	  }
     
	  if(Character.isLetter(str.charAt(i)))
	  {
	      if((str.charAt(i-1) == '+' ) && (str.charAt(i+1) == '+' ))
	      {
		  continue;
	      }
	      else 
	      {
        	  return "false";
	      }
	  }
      }
       
   return "true";
  } 
  
  public static void main (String[] args) 
  {   
    System.out.print("Please enter your string: ");
    Scanner s = new Scanner(System.in);
    System.out.print(SimpleSymbols(s.nextLine())); 
    s.close();
  }    
}