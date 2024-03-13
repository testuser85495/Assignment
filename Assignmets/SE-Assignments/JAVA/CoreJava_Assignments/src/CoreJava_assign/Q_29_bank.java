//Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and
//$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'
//are subclasses of class 'Bank', each having a method named 'getBalance'. Call this 
//method by creating an object of each of the three classes.
package CoreJava_assign;
//abstract class Bank
abstract class Bank{
	abstract int getBalance(int bal);
}
//class BankA extends bank abstract class
class BankA extends Bank{
//	method getBalance
	@Override
	int getBalance(int bal) {
		return bal;
	}
	
}
//class BankB extends bank abstract class
class BankB extends Bank{
//	method getBalance
	@Override
	int getBalance(int bal) {
		return bal;
	}
}
//class BankC extends bank abstract class
class BankC extends Bank{
//	method getBalance
	@Override
	int getBalance(int bal) {
		return bal;
	}
}
public class Q_29_bank {

	public static void main(String[] args) {
//		object for BankA,BankB,BankC
		BankA banka = new BankA();
		BankB bankb = new BankB();
		BankC bankc = new BankC();
		
//		method call
		System.out.println("BankA Balance: $"+banka.getBalance(100));
		System.out.println("BankB Balance: $"+bankb.getBalance(150));
		System.out.println("BankC Balance: $"+bankc.getBalance(200));

	}

}
