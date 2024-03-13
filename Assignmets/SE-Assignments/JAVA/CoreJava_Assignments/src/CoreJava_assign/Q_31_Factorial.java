/*Write a program to print the factorial of a number by defining a method named 
'Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*.
*(n-1) *n. E.g.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
2! = 2*1 = 2
Also, 1! = 1
0! = 0*/
package CoreJava_assign;

import java.util.Scanner;
//class create
class fact{
//	method to find Factorial
	public int Factorial(int num) {
		if (num == 0) {
			return 1;
		}
		else if (num == 1 ) {
			return 1;
		}
		else {
			return num*Factorial(num -1);
		}
		
		
	}
}


public class Q_31_Factorial {
	public static void main(String[] args) {
//		Scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
//		read user input
		int num = sc.nextInt();
		
//		object of Factorial class
		fact F = new fact();
//		method call
		System.out.println("Factorial of "+num+" = "+F.Factorial(num));
		
	}

}
