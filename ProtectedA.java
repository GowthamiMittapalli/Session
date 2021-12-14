
package AccessModifier;

public class ProtectedA {
	protected void method()
	{
		System.out.println("calling protected  using subclass");
	}

}
// public class ProtectedAccessA extends ProtectedA {
//	
//
//	public static void main(String[] args) {
//		ProtectedAccessA obj = new ProtectedAccessA ();
//		obj.method();
//
//	}
//
//}
package AccessModifier;

public class ProtectedAccessA extends ProtectedA {
	

	public static void main(String[] args) {
		ProtectedAccessA obj = new ProtectedAccessA ();
		obj.method();

	}

}
