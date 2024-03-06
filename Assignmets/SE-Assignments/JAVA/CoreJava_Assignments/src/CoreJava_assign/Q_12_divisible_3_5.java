//Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 
//and by both
package CoreJava_assign;

public class Q_12_divisible_3_5 {

	public static void main(String[] args) {
		

		System.out.println("Numbers divisible by 3, 5 and both :");
		
		// print numbers using for loop
		for (int i = 1; i <= 100; i++) {
			if ((i % 3 == 0 && i % 5 == 0) || (i % 3 == 0) || (i % 5 == 0)) {
				System.out.println(i);
			}
		}
	}

}
