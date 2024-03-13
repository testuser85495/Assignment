//Write a program to print the area and parameter of a triangle having sides of 3, 4 and 
//5 units by creating a class named 'Triangle' without any parameter in its constructor.

package CoreJava_assign;
//Triangle class create
class Triangle{
//	constructor
	Triangle(){
		
	}
//	method to find area
	public int area(int a,int b,int c) {
		return a+b+c;
		
	}
}

public class Q_26_triangle {

	public static void main(String[] args) {
//		object of Triangle
		Triangle triangle = new Triangle();
//		method call
		System.out.println("Area of riangle: "+triangle.area(3, 4, 5));

	}

}
