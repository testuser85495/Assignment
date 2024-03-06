//Write a Java program to count the letters, spaces, numbers and other characters of 
//an input string.
//

package CoreJava_assign;

import java.util.Scanner;

public class Q_08_count_letter {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int letter = 0;
		int spaces = 0;
		int number = 0;
		int other = 0;
		System.out.print("Enter a string which contain letters, spaces, numbers and other characters :");
		//read input
		String str = Scanner.nextLine();
//		assign String to char array
		char[] ch = str.toCharArray(); 
		
//		loop for length of char
		for (int i = 0; i < ch.length; i++) {
//			to count number of letter
			if(Character.isLetter(ch[i])) {
				letter++;
			}
//			to count number of digits
			else if(Character.isDigit(ch[i]))
			{
				number++;
			}
//			to count number of space
			else if (Character.isSpaceChar(ch[i])) {
				spaces++;
			} 
//			to count number of other char...
			else {
				other++;

			}
		}
		
//		print counters
		System.out.println("Letter count: "+ letter);
		System.out.println("Number count: "+ number);
		System.out.println("Space count: "+ spaces);
		System.out.println("Other character count: "+ other);
	}

}
