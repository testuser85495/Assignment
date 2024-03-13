//Create a class with a method that prints "This is a parent class" and its subclass with 
//another method that prints "This is child class". Now, create an object for each of 
//the class and call 1 - method of parent class by object of parent class 2 - method of 
//child class by object of child class 3 - method of parent class by object of child class

package CoreJava_assign;
//class create
class A{
//	method create
	public void p() {
		System.out.println("This is a parent class");
	}
}
//class create which extends A class
class B extends A{
//	method create
	public void q(){
		System.out.println("This is a child class");
	}
}

public class Q_23_This_is_a_parent_class {

	public static void main(String[] args) {
//		object of class create
		A a = new A();
		B b = new B();
		
//		method call
		a.p();
		b.q();
		b.p();
		

	}

}
