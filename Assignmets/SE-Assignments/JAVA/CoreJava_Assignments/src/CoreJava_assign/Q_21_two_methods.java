/*Create a class to print an integer and a character with two methods having the same 
name but different sequence of the integer and the character parameters. For
example, if the parameters of the first method are of the form (int n, char c), then 
that of the second method will be of the form (char c, int n).*/

package CoreJava_assign;

//class create
class print_int_char{
//	method create
	public void sequence(int n,char c) {
		System.out.println("Integer: " + n+ " character: "+ c);
	}
//	method create
	public void sequence(char c,int n) {
		System.out.println("character: "+ c+" Integer: "+n);
		
	}
}

public class Q_21_two_methods {

	public static void main(String[] args) {
//		object of class
		print_int_char print_int_char = new print_int_char();
		
//		method call
		print_int_char.sequence(20 , 'a');
		print_int_char.sequence('a', 20);

	}

}
