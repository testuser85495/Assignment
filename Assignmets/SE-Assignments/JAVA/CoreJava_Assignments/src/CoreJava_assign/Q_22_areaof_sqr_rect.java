/*Create a class to print the area of a square and a rectangle. The class has two methods 
with the same name but different number of parameters. The method for printing 
area of a rectangle has two parameters which are length and breadth respectively 
while the other method for printing area of square has one parameter which is side 
of square.*/

package CoreJava_assign;

class areaof_sqr_rect{
	public double find_area(double length ,double breadth) {
		return length*breadth;
	}
	public int find_area(int side) {
		return side*side;
	}
}

public class Q_22_areaof_sqr_rect {

	public static void main(String[] args) {
		areaof_sqr_rect area = new areaof_sqr_rect();
		
		System.out.println("Area of rectangle:  "+ area.find_area(2.5, 4.5));
		System.out.println("Area of Square: "+area.find_area(10));

	}

}
