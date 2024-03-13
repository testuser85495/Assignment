/*Create a class named 'Member' having the following members:
1. Data members
2. Name
3. Age
4. Phone number
5. Address
6. Salary
It also has a method named 'printSalary' which prints the salary of the members.*/


package CoreJava_assign;
//class create
class Menber{
	int data;
	String name;
	int age;
	long phone_no;
	String address;
	double salary;
//	method create
	public void printSalary(double salary) {
		System.out.println(salary);
	}
}

public class Q_24_member {

	public static void main(String[] args) {
//		object of class create
		Menber menber = new Menber();
		
//		method call
		menber.printSalary(30000.00);

	}

}
