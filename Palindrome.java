/*
 * author Matthew Parsley 
 */

/*
 * imports the required utilities 
 */
import java.util.*;

/*
 * creates our main class for creating the palindrome
 */
public class Palindrome {
	
	
	/* determines if our choosen word is a palindrome
	 * @param a String, specifically the word that we want to test if it is a palindrome or not
	 * @return true if the word is a Palindrome, or false if it is not one.
	 */
	public static boolean isPalindrome(String str) {
		
		Stack<Character> stack = new Stack<>();
		char[] strArray = str.toCharArray();
		
		boolean compare = true;
		
		for (int i = 0;  i < strArray.length; i++) {
			stack.push(strArray[i]);
		}
		
		for (int i = 0; i < strArray.length && compare; i++) {
			if (strArray[i] != stack.pop()) 
				compare = false;
		}
		
		
		return compare;
	}
	
}
