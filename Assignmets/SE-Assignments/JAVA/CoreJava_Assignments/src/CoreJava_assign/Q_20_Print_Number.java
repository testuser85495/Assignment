/*Create a class named 'Print Number' to print various numbers of different data types 
by creating different methods with the same name 'printn' having a parameter for 
each data type.*/


package CoreJava_assign;

//class create
class Print_Number{
//	method create
	public void printn(int a) {
		System.out.println("Integer: "+a);
	}
//	method create
	public void printn(double b) {
		System.out.println("Double: "+b);
	}
//	method create
	public void printn(float c) {
		System.out.println("Float: "+c);
	}
//	method create
	public void printn(long d) {
		System.out.println("Long: "+d);
	}
	
}

public class Q_20_Print_Number {
	public static void main(String[] args) {
//		object of class 
		Print_Number pn = new Print_Number();
		
//		method call
		pn.printn(4);
		pn.printn(2.5);
		pn.printn(4.5);
		pn.printn(12345);
		
	}


}
