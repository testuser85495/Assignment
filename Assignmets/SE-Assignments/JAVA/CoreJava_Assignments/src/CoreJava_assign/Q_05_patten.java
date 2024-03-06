package CoreJava_assign;

public class Q_05_patten {

	public static void main(String[] args) {
		//outer loop for row
		for(int i=1; i<=5;i++) {
			
//			inner loop for column
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}

	}

}
