/*
 * author Matthew Parsley
 */

/*
 * imports our utilites we need
 */
import java.util.Scanner;

/*
 * creates our class to test our other palindrome class
 */

public class Application {

	public static void main(String[] args) {
		
		/*
		 * makes it to where our user can choose what word they want to test
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please choose a word:");
		String word = scan.nextLine();
		
		/*
		 * prints out our statement for whether the choosen word is a palindrome or not.
		 */
		
		System.out.println("the choosen word is a palindrome:" + Palindrome.isPalindrome(word));
		
		
		
		
		
		
		
		
		/*
		 * closes our Scanner system so it does remain open for entirety.
		 */
		scan.close();
		
	}

	
}
