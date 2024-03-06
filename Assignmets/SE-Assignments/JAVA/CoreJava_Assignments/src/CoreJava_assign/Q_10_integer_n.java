/*Write a Java program that accepts an integer (n) and computes the value of 
n+nn+nnn. Input number: 5
5 + 55 + 555*/


package CoreJava_assign;

import java.util.Scanner;

public class Q_10_integer_n {

	public static void main(String[] args) {
//		user input
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enetr a number: ");
//		read user input
		int n = sc.nextInt();
		
		int nn = n*10 + n; //5 *10 + 5 = 55
		int nnn = n*100 + nn; // 5*100 + 55 = 555
		int sum = n+nn+nnn;	//5+55+555 = 615
//		print sum
		System.out.println(sum); 
	}

}
