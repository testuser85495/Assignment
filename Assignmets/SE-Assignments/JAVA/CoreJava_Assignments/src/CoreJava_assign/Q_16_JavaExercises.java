//W.A.J.P to check whether a given string ends with the contents of another string. 
//Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True


package CoreJava_assign;

import java.util.Scanner;

public class Q_16_JavaExercises {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string ends with 'se' : ");
		
		//read user input
		String str =sc.next();
		
		// contains check there is input 
		System.out.println(str.contains("se"));
		

	}

}
