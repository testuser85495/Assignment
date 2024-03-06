/*Write a Java program that takes the user to provide a single character from the 
alphabet. Print Vowel or Consonant, depending on the user input. If the user input 
is not a letter (between a and z or A and Z), or is a string of length > 1, print an error 
message.*/

package CoreJava_assign;

import java.util.Scanner;

public class Q_02_alphabet {

	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        String input = sc.next().toUpperCase();

//        condition latter is more than one
        if(input.length() > 1) {
        	System.out.println(input + " Enter a single character only");
        }
        
        else {
//        	case on user input
        	switch (input) {
//        	case for vowel
			case "A","E","I","O","U":
				System.out.println(input +" letter is Vowel");
				break;
//			case for consonant
			case "B","C","D","F","G","H","J","K","L","M","N","P","Q","R","S","T","V","W",
			"X","Y","Z":
				System.out.println(input+ " letter is Consonant");
				break;
//			not a latter
			default:
				System.out.println(input +" is Not a letter");
				break;
			}
        }
    }

}
