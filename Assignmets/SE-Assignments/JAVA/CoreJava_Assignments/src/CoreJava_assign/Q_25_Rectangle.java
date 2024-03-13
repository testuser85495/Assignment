/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
two methods to print the area and perimeter of the rectangle respectively. Its 
constructor having parameters for length and breadth is used to initialize the length 
and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its 
constructor having a parameter for its side (suppose s) calling the constructor of its 
parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.*/

package CoreJava_assign;
//class create for Rectangle
class Rectangle{
	int length;
	int breadth;
//	constructor
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
//	method create
	public int area() {
		return length*breadth;
		
	}
//	method create
	public int perimeter() {
		return  2*(length+breadth);
	}
}
class Square extends Rectangle{
//	method create
	Square(int side) {
		 // Call the constructor of the parent class 
		super(side, side);
		// TODO Auto-generated constructor stub
	}
	

}
public class Q_25_Rectangle {

	public static void main(String[] args) {
		
//		object og Rectangle
		Rectangle rect = new Rectangle(4, 5);
//		method call
		System.out.println("Area of rectangel: "+rect.area());
		System.out.println("Area of perimeter: "+rect.perimeter());
//		object of Square
		Square sqr = new Square(2);
//		method call
		System.out.println("Area of square: "+ sqr.area());
		
	}

}
