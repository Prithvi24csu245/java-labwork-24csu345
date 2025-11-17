abstract class Bank{
	abstract void getBalance();
}
class BankA extends Bank{
	void getBalance (){
		System.out.println("$100 are deposited to this bank A");
	}
}
class BankB extends Bank{
	void getBalance (){
		System.out.println("$150 are deposited to this bank B");
	}
}
class BankC extends Bank{
	void getBalance (){
		System.out.println("$200 are deposited to this bank C");
	}
}
class Q4{
	public static void main(String args[]){
	    System.out.print(" Prithviraj 24csu345");
		BankA a = new BankA();
		a.getBalance();
		BankB b = new BankB();
		b.getBalance();
		BankC c = new BankC();
		c.getBalance();
	}

}
