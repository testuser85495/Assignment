/*We have to calculate the percentage of marks obtained in three subjects (each out of 
100) by student A and in four subjects (each out of 100) by student B. Create an 
abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two 
other classes 'A' and 'B' each having a method with the same name which returns the 
percentage of the students. The constructor of student A takes the marks in three 
subjects as its parameters and the marks in four subjects a sits parameters for student
B. Create an object for each of the two classes and print the percentage of marks for 
both the students.*/
package CoreJava_assign;
//abstract class 
abstract class Marks{
	abstract double getPercentage();
}
//class create extends abstract marks
class A1 extends Marks{
	private int m1,m2,m3;
	
	
	A1(int m1,int m2,int m3){
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
//	Method create
	@Override
	double getPercentage(){
		double total = m1+m2+m3;
		double per = (total / 300)*100;
		return per;
		
	}
}
//class create extends abstract marks
class B1 extends Marks{
	private int m1,m2,m3,m4;
	B1(int m1,int m2,int m3,int m4){
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
	}
//	Method create
	@Override
	double getPercentage() {
		double total = m1+m2+m3+m4;
		double per = (total /400)*100;
		return per;
	}
}


public class Q_30_percentage {

	public static void main(String[] args) {
//		object of class A1,B1
		A1 a = new A1(25,50,60);
		B1 b = new B1(60, 70, 80, 90);
		
//		Method call
		System.out.println("Persentage of Student A : "+a.getPercentage()+"%");
		System.out.println("Persentage of Student B : "+b.getPercentage()+"%");
		
		
	}

}
