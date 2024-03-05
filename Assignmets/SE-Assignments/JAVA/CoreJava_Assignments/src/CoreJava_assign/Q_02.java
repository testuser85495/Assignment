/*Write a Java program that takes the user to provide a single character from the 
alphabet. Print Vowel or Consonant, depending on the user input. If the user input 
is not a letter (between a and z or A and Z), or is a string of length > 1, print an error 
message.*/

package CoreJava_assign;

import java.util.Scanner;

public class Q_02 {

	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        String input = in.next().toUpperCase();

        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.equals("A") || input.equals("E") || input.equals("I")
                || input.equals("O") || input.equals("U");

        if (input.length() > 1)
        {
            System.out.println(input + " Enter a single character only");
        }
        else if (!(uppercase || lowercase))
        {
            System.out.println(input +" Not a letter");
        }
        else if (vowels)
        {
            System.out.println(input +" letter is Vowel");
        }
        else
        {
            System.out.println(input+ " letter is Consonant");
        }
    }

}
