/**
Using the Java language, have the function FirstReverse(str) take the str parameter being passed and return the 
string in reversed order. For example: if the input string is "Hello World and Coders" then your program should 
return the string sredoC dna dlroW olleH. 

Sample Test Cases:

Input:"coderbyte"
Output:"etybredoc"

Input:"I Love Code"
Output:"edoC evoL I"
 */

package FirstReverse;
import java.util.*; 

class Main 
{  
  public static String FirstReverse(String str) 
  { 
    char[] strChars = str.toCharArray();
    char[] reverse = new char[strChars.length];

    for(int i = strChars.length-1, j = 0; i >= 0; i--, j++)
    {
    	reverse[j] = strChars[i];
    }
    //ValueOf: This method returns the string representation of the passed argument
    //valueOf(char[] data)_ Returns the string representation of the char array argument
    String backwards = String.valueOf(reverse);
       
    return backwards;
  } 
  
  public static void main (String[] args) 
  {  
    System.out.print("Please enter a string you want to reverse: "); 
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
    s.close();
  }   
} 