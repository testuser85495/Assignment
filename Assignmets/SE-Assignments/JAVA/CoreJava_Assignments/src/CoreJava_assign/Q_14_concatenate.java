//W.A.J.P to concatenate a given string to the end of another string.
package CoreJava_assign;

import java.util.Scanner;

public class Q_14_concatenate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String :");
//		read input
		String str1 = sc.nextLine();
		System.out.print("Enter a String :");
//		read input
		String str2 = sc.nextLine();
		
//		print concatenate string
		System.out.println(str1.concat(str2));
	}

}
