//Write a Java program to print the ASCII value of a given character.


package CoreJava_assign;

import java.util.Scanner;

public class Q_09_Ascii {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		user input
		System.out.print("Enter an character: ");
//		read input
		char ch = sc.next().charAt(0);
//		convert ch to int
		int ascii = ch;
		
//		print ascii value
		System.out.println("The ASCII value of "+ch+" is "+ascii);
		
		
		
		

	}

}
