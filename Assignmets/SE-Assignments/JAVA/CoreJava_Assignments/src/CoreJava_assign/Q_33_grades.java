/*Write a program which will ask the user to enter his/her 
marks (out of 100). Define a method that will display grades according to the marks 
entered as below:
Marks Grade
1-100 A
1-90 B
1-80 B
1-70 C
1-60 D
41-50 DD
40 Fail*/
package CoreJava_assign;

import java.util.Scanner;

public class Q_33_grades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter yout marks (out of 100): ");
//		read user input
		int marks = sc.nextInt();
//		method call
		displayGrades(marks);
	}
//	method of grade create
	static void displayGrades(int marks) {
		
		if (marks >= 91 && marks <= 100) {
            System.out.println("Grade: A");
        }
		else if (marks >= 81 && marks <= 90) {
            System.out.println("Grade: B");
        } 
		else if (marks >= 71 && marks <= 80) {
            System.out.println("Grade: B");
        } 
		else if (marks >= 61 && marks <= 70) {
            System.out.println("Grade: C");
        } 
		else if (marks >= 51 && marks <= 60) {
            System.out.println("Grade: D");
        } 
		else if (marks >= 41 && marks <= 50) {
            System.out.println("Grade: DD");
        } 
		else if(marks <= 40) {
           System.out.println("Fail");
        }
		else {
        	System.out.println("Invalid Marks Entered.");
        }
		
	}

}

