/*Write a program in Java to make such a pattern like right angle triangle with number 
increased by 1 The pattern like:
	1
	2 3
	4 5 6
	7 8 9 10*/


package CoreJava_assign;

public class Q_06_patten {
	

	public static void main(String[] args) {
		int num=1;
//		outer lop for row
		for(int i =1 ;i<=4;i++) {
//			inner loop for column
			for(int j =1;j<=i;j++) {
				System.out.print(" "+num++);
			}
			System.out.println();
		}

	}

}
