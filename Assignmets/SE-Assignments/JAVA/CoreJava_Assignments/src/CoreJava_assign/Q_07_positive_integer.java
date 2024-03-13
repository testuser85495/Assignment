//Write a Java program that reads a positive integer and count the number of digits the 
//number

package CoreJava_assign;

import java.util.Scanner;

public class Q_07_positive_integer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		user input
		System.out.print("Enter a positive integer less than ten billion: ");
//		read input
		long num = sc.nextLong();
		int count=0;
//		number  equal to 1
		if(num >=1) {
//			number less than ten billion
			if(num < 10000000000L ) {
//				loop to count number
				while (num !=0) {
					num /= 10;
					count++;
				}
				System.out.println("Number of digits in the number: "+count);
			}
			else {
				System.out.println(num+" Enter number less than ten billion");
			}
		}
		else {
			System.out.println(num+ " is not a positive integer");
		}
	}

}
