//We have to calculate the area of a rectangle, a square and a circle. Create an abstract 
//class 'Shape' with three abstract methods namely 'RectangleArea' taking two 
//parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The 
//parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its 
//side and that of 'CircleArea' is its radius. Now create another class 'Area' containing 
//all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the 
//area of rectangle, square and circle respectively. Create an object of class 'Area' and 
//call all the three methods.
package CoreJava_assign;
//abstract class create
abstract class Shape{
	abstract int RectangleArea(int lenght, int breadth);
	abstract int SquareArea(int side);
	abstract double CircleArea(int radius);
}
//Area class Create
class Area extends Shape{
//	method to find RectangleArea
	@Override
	int RectangleArea(int lenght, int breadth) {
		return lenght*breadth ;
	}
//	method to find SquareArea
	@Override
	int SquareArea(int side) {
		// TODO Auto-generated method stub
		return side * side;
	}
//	method to find CircleArea
	@Override
	double CircleArea(int radius) {
		return (3.14 *radius *radius);
	}
	
}
public class Q_32_Shape {

	public static void main(String[] args) {
//		object create of area
		Area area = new Area();
//		method call
		System.out.println("Area of Rectangle: "+area.RectangleArea(5, 5));;
		System.out.println("Area of Square: "+area.SquareArea(5));;
		System.out.println("Area of Circle: "+area.CircleArea(5));;

	}

}
