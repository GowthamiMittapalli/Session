package AccessModifier;

public class A {
	
	protected  void add() {
		
		System.out.println("Calling protected method using non subclass");
	
	
	
	}
}

public class B {

	public static void main(String[] args) {
		A obj=new A();
		obj.add();
		

	}

}
