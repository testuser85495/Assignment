/*Write a Java program to Take three numbers from the user and print the greatest 
number.*/

package CoreJava_assign;

import java.util.Scanner;

public class Q_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//input reader
		System.out.print("Enter a number:");
		int num1 = sc.nextInt();//input reader
		System.out.print("Enter a number:");
		int num2 = sc.nextInt();//input reader
		System.out.print("Enter a number:");
		int num3 = sc.nextInt();//input reader
		
		if (num1 >= num2 && num1 >= num3 ) {
			System.out.println("The greatest number: " + num1);
		}
		else if(num2 >= num1 && num2 >= num3) {
			System.out.println("The greatest number: " + num2);
		}
		else {
			System.out.println("The greatest number: " + num3);
		}
	}

}
