//Write a program in Java to input 5 numbers from keyboard and find their sum and 
//average using for loop.

package CoreJava_assign;

import java.util.Scanner;

public class Q_04_numberformkeybord {

	public static void main(String[] args) {
		int sum =0;
		//scanner onject
		Scanner sc = new Scanner(System.in);
//		loop for 5 NO input
		for(int i=1;i<=5;i++) {
			System.out.print("Enetr a number: ");
//			read input
			int num = sc.nextInt();
//			find sum of numbers
			sum += num;
		}
//		find average of sum
		double avg = (sum / 5.0);
		System.out.println("Sum of input is: "+sum);
		System.out.println("Average of input is: "+avg);
		
		sc.close();

	}

}
